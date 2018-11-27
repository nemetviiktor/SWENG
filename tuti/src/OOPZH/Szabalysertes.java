package OOPZH;



public abstract class Szabalysertes {
	
	private String nev;
	private int alapbirsag;
	
	

	public Szabalysertes(String nev, int alapbirsag) {
		super();
		this.nev = nev;
		this.alapbirsag = alapbirsag;
	}

	public String getNev() {
		return nev;
	}

	public int getAlapbirsag() {
		return alapbirsag;
	}
	
	public abstract int birsag();
	

}