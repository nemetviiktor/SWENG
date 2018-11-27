package OOPZH;

public class Gyorshajtas extends Szabalysertes {

	private int szazalek;
	
	public Gyorshajtas(String nev, int alapbirsag, int szazalek) {
		super(nev, alapbirsag);
		this.szazalek = szazalek;
	}



	@Override
	public int birsag() {
		return getAlapbirsag()*(szazalek/100+1);
	}



	@Override
	public String toString() {
		return "Gyorshajtas [Fizetendõ bírság=" + birsag() + ", Elkövetõ neve=" + getNev() + "]";
	}
	
	public boolean nagyobbE(Gyorshajtas other) {
		if (birsag() > other.birsag()) {
			return true;
		}
		return false;
	}
	
	
	
	

	
}