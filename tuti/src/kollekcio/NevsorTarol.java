package kollekcio;

import java.util.ArrayList;

public class NevsorTarol {
	private ArrayList<Hallgato> nevsor;

	public NevsorTarol() {
		this.nevsor = new ArrayList<Hallgato>();
	}

	public void hallgatoHozzaad(Hallgato h) {
		if (h == null)
			return;

		if (this.nevsor.contains(h))
			return;

		this.nevsor.add(h);
	}

	public void hallgatoTorol(Hallgato h) {
		if (h == null)
			return;

		if (!this.nevsor.contains(h))
			return;

		this.nevsor.remove(h);
	}

	public ArrayList<Hallgato> getNevsor() {
		return nevsor;
	}

	public void setNevsor(ArrayList<Hallgato> nevsor) {
		this.nevsor = nevsor;
	}

	public void nevsorKiir() {
		for (Hallgato h : this.nevsor)
			System.out.println(h.toString());
	}

	public Hallgato nevKeres(String keresettNev) {
		for (Hallgato h : this.nevsor) {
			if (h.getNev().equalsIgnoreCase(keresettNev))
				return h;
		}

		return null;
	}

	public void nevalapjanTorol(String nev) {
		for (Hallgato h : this.nevsor) {
			if (h.getNev().equalsIgnoreCase(nev))
				this.nevsor.remove(h);
		}
	}
}