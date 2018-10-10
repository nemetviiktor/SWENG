package fajl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
	
	private static Nevsor nevsor = new Nevsor();

	public static void main(String[] args) {
		
		try {
			beolvas("adatok.txt");
			nevsor.nevsorKiir();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void beolvas(String fnev) throws IOException{
		BufferedReader bf;
		String sor;
		String nev;
		String neptunKod;
		
		
		try {
			bf = new BufferedReader(new FileReader(fnev));
			
			while((sor = bf.readLine()) != null) {
				/*Scanner sc = new Scanner(sor);
				sc.useDelimiter("\\|");
				
				nev = sc.next();
				neptunKod = sc.next();*/
				
				String[] tomb = sor.split("\\|");
				
				nev = tomb[0];
				neptunKod = tomb[1];
				
				nevsor.hallgatoHozzaad(new Hallgato(nev, neptunKod));
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		

	}
	
	public static void kiir(String fnev) {
		FileWriter w;
		
		try {
			w = new FileWriter(fnev, true);
			w.write(fnev + "|" + neptunKod);
			nevsor.hallgatoHozzaad(new Hallgato(nev, neptunKod));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	

}
