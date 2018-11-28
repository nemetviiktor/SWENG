package kollekcio;

public class Hallgato {
	private String nev;
	private String neptun;

	public Hallgato(String nev, String neptun) {
		this.nev = nev;
		this.neptun = neptun;
	}

	@Override
	public String toString() {
		return "Nevsor [nev=" + nev + ", neptun=" + neptun + "]";
	}

	public String getNev() {
		return nev;
	}

	public String getNeptun() {
		return neptun;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public void setNeptun(String neptun) {
		this.neptun = neptun;
	}
}