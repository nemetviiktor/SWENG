package zhpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class masodik extends felhasznalo{
	
	public masodik(String felhasznalonev, int szuletesiev, zhpackage.vegzettseg vegzettseg) {
		super(felhasznalonev, szuletesiev, vegzettseg);
	}

	private ArrayList<felhasznalo> felhasznalok;
	
	public void felhasznaloFelvet(felhasznalo f) {
		if (f == null || this.felhasznalok.contains(f)) {
			return;
		}
		this.felhasznalok.add(f);
	}
	
	public int getFelhasznalokSzama() {
		return this.felhasznalok.size();
	}
	
	//FELADAT KELL IDE
	
	
	public void felhasznaloTorol(felhasznalo f) {
		if (f == null) {
			return;
		}
		this.felhasznalok.remove(f);
	}
	
	public void felhasznaloKiir() {
	for (felhasznalo f : felhasznalok)
		System.out.println(f.toString());
	}
	

	public String legidosebb() {
		felhasznalo idos = felhasznalok.get(0);
		for (int i = 0; i < felhasznalok.size(); i++) {
			if (idos.getSzuletesiev() > felhasznalok.get(i).getSzuletesiev()) {
				idos=felhasznalok.get(i);
			}
		}
		return idos.toString();
	}
	
	public void diplomasokKiir() {
		for (felhasznalo f : felhasznalok) {
			if (getVegzettseg().equals(vegzettseg.DIPLOMA)) {
				System.out.println(f.toString());
			}
			
		}
	}
	


}
