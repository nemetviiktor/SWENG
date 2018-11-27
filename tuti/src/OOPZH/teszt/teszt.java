package rend.teszt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import rend.Gyorshajtas;

public class Szabalyteszt {

	public static void main(String[] args) throws IOException {
		
		Gyorshajtas[] gyorshajtasTomb = new Gyorshajtas[5];
		
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < gyorshajtasTomb.length; i++) {
			gyorshajtasTomb[i] = new Gyorshajtas(scanner.next(), scanner.nextInt(), scanner.nextInt());
		}
		
		
		/*
		String thisLine = null;
		
		for (int i = 0; i < gyorshajtasTomb.length; i++) {
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				gyorshajtasTomb[i] = new Gyorshajtas(thisLine, (Integer.parseInt(thisLine)), (Integer.parseInt(thisLine)));
				}
		}
		*/
		
		Gyorshajtas maxBirsag = gyorshajtasTomb[0];
		for (int i = 1; i < gyorshajtasTomb.length; i++) {
			if (!(maxBirsag.nagyobbE(gyorshajtasTomb[i]))) {
				maxBirsag = gyorshajtasTomb[i];
			}
		}
		
		System.out.println("Legnagyobb bírságot fizetõ személy neve: "+ maxBirsag.getNev());
		
		int atlagBirsagSzamlalo = 0;
		int atlagBirsag = 0;
		
		for (int i = 0; i < gyorshajtasTomb.length; i++) {
			atlagBirsagSzamlalo += gyorshajtasTomb[i].birsag();
		}
		atlagBirsag = atlagBirsagSzamlalo / gyorshajtasTomb.length;
		System.out.println("Az átlagbírság: " + atlagBirsag);
		
		
		for (int i = 0; i < gyorshajtasTomb.length; i++) {
			System.out.println(gyorshajtasTomb[i]);
		}
		
	}

}