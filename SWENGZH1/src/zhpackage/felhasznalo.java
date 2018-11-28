package zhpackage;

import java.util.Comparator;

enum vegzettseg {
	ALTALANOS, ERETTSEGI, DIPLOMA;
}

public class felhasznalo {
	private String felhasznalonev;
	private int szuletesiev;
    public vegzettseg vegzettseg;

	public felhasznalo(String felhasznalonev, int szuletesiev, vegzettseg vegzettseg) {
		super();
		this.felhasznalonev = felhasznalonev;
		this.szuletesiev = szuletesiev;
		this.vegzettseg = vegzettseg;
	}

	public String getFelhasznalonev() {
		return felhasznalonev;
	}

	public void setFelhasznalonev(String felhasznalonev) {
		this.felhasznalonev = felhasznalonev;
	}

	public int getSzuletesiev() {
		return szuletesiev;
	}

	public void setSzuletesiev(int szuletesiev) {
		this.szuletesiev = szuletesiev;
	}

	public vegzettseg getVegzettseg() {
		return vegzettseg;
	}

	public void setVegzettseg(vegzettseg vegzettseg) {
		this.vegzettseg = vegzettseg;
	}

	@Override
	public String toString() {
		return "felhasznalo [felhasznalonev=" + felhasznalonev + ", szuletesiev=" + szuletesiev + ", vegzettseg="
				+ vegzettseg + "]";
	}

	
	
    public class idosebb implements Comparator<felhasznalo> {

        @Override
        public int compare(felhasznalo egyik, felhasznalo masik) {
            if(egyik.szuletesiev > masik.szuletesiev) 
            	return egyik.szuletesiev;
            else if ( 
            	egyik.szuletesiev == masik.szuletesiev){ return 0;}
            else{
            	return masik.szuletesiev;}
        }
    }
	
	
	
	
	
	
	

}
