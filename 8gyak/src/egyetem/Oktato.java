package egyetem;

import java.time.LocalDate;

public class Oktato {
	private String nev;
	LocalDate szulDatum;
	private String beosztas;
	
	public Oktato(String nev, LocalDate szulDatum, String beosztas) {
		super();
		this.nev = nev;
		this.szulDatum = szulDatum;
		this.beosztas = beosztas;
	}

	@Override
	public String toString() {
		return "Oktato [nev=" + nev + ", szulDatum=" + szulDatum + ", beosztas=" + beosztas + "]";
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public LocalDate getSzulDatum() {
		return szulDatum;
	}

	public void setSzulDatum(LocalDate szulDatum) {
		this.szulDatum = szulDatum;
	}

	public String getBeosztas() {
		return beosztas;
	}

	public void setBeosztas(String beosztas) {
		this.beosztas = beosztas;
	}
	
	
	
}
