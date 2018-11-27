package tuti;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
	private static Szotar szotar = new Szotar();

	public static void main(String[] args) {
		File f = new File("szotar.txt");

		if (!f.isFile()) {
			System.out.println("A megadott fajl hibas vagy nem letezik!");
			return;
		}

		try {
			beolvas(f);
			szotar.szotarKiir();

			System.out.println("");
			
			ujSzoHozzad("szotar.txt", "autó", "car");
			szotar.szotarKiir();
			
			//szotar.szoHozzad("konyv", "book");
			//szotar.adatokFajlbaIr("szotar.txt");

			System.out.println("A keresett szo angol megfeleloje: " + szotar.szoKeres("kutya"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void beolvas(File beFajl) throws IOException {
		BufferedReader in = null;
		String magyarSzo;
		String angolSzo;
		String sor;

		try {
			in = new BufferedReader(new FileReader(beFajl));

			while ((sor = in.readLine()) != null) {
				String tomb[] = sor.split("=");
				magyarSzo = tomb[0];
				angolSzo = tomb[1];

				szotar.szoHozzad(magyarSzo, angolSzo);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void ujSzoHozzad(String fajlnev, String magyar, String angol) {
		FileWriter writer;
		try {
			writer = new FileWriter(fajlnev, true); // hozzafuzes
			writer.write(magyar + "|" + angol + "\n"); // fajlba íras
			szotar.szoHozzad(magyar, angol); // map-hez adas
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}