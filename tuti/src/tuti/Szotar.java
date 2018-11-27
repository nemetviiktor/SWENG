package tuti;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;

public class Szotar {
	private HashMap<String, String> szotar;

	public Szotar() {
		this.szotar = new HashMap<String, String>();
	}

	public HashMap<String, String> getSzotar() {
		return szotar;
	}

	public void setSzotar(HashMap<String, String> szotar) {
		this.szotar = szotar;
	}

	public void szoHozzad(String magyar, String angol) {
		if (magyar == null || angol == null)
			return;

		if (this.szotar.containsKey(magyar))
			return;

		this.szotar.put(magyar, angol);
	}

	public void szoTorol(String magyar) {
		if (magyar == null)
			return;

		if (!this.szotar.containsKey(magyar))
			return;

		this.szotar.remove(magyar);
	}

	public String szoKeres(String keres) {
		if (keres == null)
			return null;

		return this.szotar.get(keres);
	}

	public void szotarKiir() {
		for (Entry<String, String> szo : szotar.entrySet()) {
			System.out.println(szo.getKey() + " = " + szo.getValue());
		}
	}

	public void adatokFajlbaIr(String fajlnev) {
		FileWriter writer;
		try {
			writer = new FileWriter(fajlnev);

			for (Entry<String, String> szo : this.szotar.entrySet()) {
				writer.write(szo.getKey() + "=" + szo.getValue() + "\n");
			}
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}