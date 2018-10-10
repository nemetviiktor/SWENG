package fajl;

import java.util.ArrayList;

public class Nevsor {
	private ArrayList<Hallgato> nevsor;
	
	public Nevsor() {
		this.nevsor = new ArrayList<Hallgato>();
	}
	
	public void hallgatoHozzaad(Hallgato h) {
		if(h == null)
			return;
		
		if(this.nevsor.contains(h))
			return;
		
		this.nevsor.add(h);
	}
	
	public void hallgatoTorol(Hallgato h) {
		if(h == null)
			return;
		
		if(!this.nevsor.contains(h))
			return;
		
		this.nevsor.remove(h);
	}
	
	public void nevsorKiir() {
		for (Hallgato h : nevsor) {
			System.out.println(h.toString());
		}
	}
	
	public void hallgatoKeres(String nev) {
		for (Hallgato h : nevsor) {
			if(h.getNev().equalsIgnoreCase(nev)) {
				return h;
			}
		}
		return null;
	}
	
	public void hallgatoTorol(String nev) {
		for (Hallgato h : nevsor) {
			if (h.getNev() ) {
				
			}
		}
	}

}
