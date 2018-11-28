package kollekcio;

import java.io.*;
import java.util.Scanner;

public class Test {
	private static NevsorTarol nevsor = new NevsorTarol();

	
	public static void main(String[] args) {
		/*
		 * Hallgato h1 = new Hallgato("TT1", "123451"); Hallgato h2 = new
		 * Hallgato("TT2", "123452"); Hallgato h3 = new Hallgato("TT3", "123453");
		 * 
		 * nevsor.hallgatoHozzaad(h1); nevsor.hallgatoHozzaad(h2);
		 * nevsor.hallgatoHozzaad(h3);
		 * 
		 * for (Hallgato h : nevsor.getNevsor()) System.out.println(h.toString());
		 * 
		 */
		File f = new File("adatok.txt");
		
		if(!f.isFile()) {
			System.out.println("A megadott fajl hibas vagy nem letezik!");
			return;
		}
		
		try {
			beolvas(f);
			nevsor.nevsorKiir();
			adatokatKiir("kiir.txt");
			
			Hallgato keresett = nevsor.nevKeres("TT20");
			
			if(keresett == null) {
				System.out.println("Nincs benne a keresett ilyen hallgato!");
				return;
			}
			
			System.out.println("A keresett: " + keresett.toString());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void beolvas(File beFajl) throws IOException {
		BufferedReader in = null;
		String sor;
		String nev;
		String neptun;

		try {
			in = new BufferedReader(new FileReader(beFajl));

			while ((sor = in.readLine()) != null) {
				// Scanner sc = new Scanner(sor);
				// sc.useDelimiter("\\|");
				// nev = sc.next();
				// neptun = sc.next();

				String tomb[] = sor.split("\\|");
				nev = tomb[0];
				neptun = tomb[1];

				nevsor.hallgatoHozzaad(new Hallgato(nev, neptun));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void adatokatKiir(String fajlnev) { 
		FileWriter writer;
		try {
			writer = new FileWriter(fajlnev);
		
			for(Hallgato h : nevsor.getNevsor()) {
				writer.write(h.getNev() + "|" + h.getNeptun() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	
}