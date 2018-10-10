package fajl;

public class Hallgato {
	private String nev;
	private String neptunkod;
	
	public Hallgato(String nev, String neptunkod) {
		super();
		this.nev = nev;
		this.neptunkod = neptunkod;
	}
	
	public String getNev() {
		return nev;
	}
	public void setNev(String nev) {
		this.nev = nev;
	}
	public String getNeptunkod() {
		return neptunkod;
	}
	public void setNeptunkod(String neptunkod) {
		this.neptunkod = neptunkod;
	}
	
	@Override
	public String toString() {
		return "Hallgato [nev=" + nev + ", neptunkod=" + neptunkod + "]";
	}
	

}
