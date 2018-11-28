package zhpackageTEST;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import zhpackage.felhasznalo;
import zhpackage.masodik;


public class Teszt {

	public static void main(String[] args) {
		

		File f = new File("adatok.txt");
		
		if(!f.isFile()) {
			System.out.println("A megadott fajl hibas vagy nem letezik!");
			return;
		}
		
		try {
			beolvas(f);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		

		

	}

	public static void beolvas(File beFajl) throws IOException {
		BufferedReader in = null;
		String sor;
		String felhasznalonev;
		int szuletesiev;
		Vegzettseg;  //ENUM

		try {
			in = new BufferedReader(new FileReader(beFajl));

			while ((sor = in.readLine()) != null) {
				String tomb[] = sor.split(",");
				felhasznalonev = tomb[0];
				szuletesiev = Integer.parseInt(tomb[1]);
				Vegzettseg = tomb[2];

				felhasznalo.hallgatoHozzaad(new felhasznalo(felhasznalonev, szuletesiev, Vegzettseg);  //ENUM
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
