package egyetem;

import java.util.ArrayList;
import java.util.List;

public class Egyetem {
	private String nev;
	private String rektor;
	private List<Kar> karok;
	
	public Egyetem(String nev, String rektor) {
		super();
		this.nev = nev;
		this.rektor = rektor;
		this.karok = new ArrayList<Kar>();
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getRektor() {
		return rektor;
	}

	public void setRektor(String rektor) {
		this.rektor = rektor;
	}

	public List<Kar> getKarok() {
		return karok;
	}

	public void setKarok(List<Kar> karok) {
		this.karok = karok;
	}

	@Override
	public String toString() {
		return "Egyetem [nev=" + nev + ", rektor=" + rektor + "]";
	}
	
	
	public void karHozzaad(Kar k) {
		if(k == null || this.karok.contains(k))  //ismétlõdés
			return;
		this.karok.add(k);
	}
	
	public void karListaz() {
		for (Kar k : karok) {
			System.out.println(k.toString());
		}
	}
	
	
	
	class Kar {
		private String nev;
		private String dekan;
		private List<Tanszek> tanszekek;
		
		
		public Kar(String nev, String dekan) {
			super();
			this.nev = nev;
			this.dekan = dekan;
			this.tanszekek = new ArrayList<Tanszek>();
		}


		public String getNev() {
			return nev;
		}


		public void setNev(String nev) {
			this.nev = nev;
		}


		public String getDekan() {
			return dekan;
		}


		public void setDekan(String dekan) {
			this.dekan = dekan;
		}


		public List<Tanszek> getTanszekek() {
			return tanszekek;
		}


		public void setTanszekek(List<Tanszek> tanszekek) {
			this.tanszekek = tanszekek;
		}
		
		@Override
		public String toString() {
			return "Kar [nev=" + nev + ", dekan=" + dekan + ", tanszekek=" + tanszekek + "]";
		}

		public void tanszekHozzaad(Tanszek t) {
			if(t == null || this.tanszekek.contains(t))  //ismétlõdés
				return;
			this.tanszekek.add(t);
		}
		
		public void tanszekListaz() {
			for (Tanszek t : tanszekek) {
				System.out.println(t.toString());
			}
		}
		

		class Tanszek {
			private String nev;
			private String vezeto;
			private List<Oktato> oktatok;
			
			public Tanszek(String nev, String vezeto) {
				super();
				this.nev = nev;
				this.vezeto = vezeto;
				this.oktatok = new ArrayList<Oktato>();
				
			}
			
			public String getNev() {
				return nev;
			}


			public void setNev(String nev) {
				this.nev = nev;
			}


			public String getVezeto() {
				return vezeto;
			}


			public void setVezeto(String vezeto) {
				this.vezeto = vezeto;
			}


			public List<Oktato> getOktatok() {
				return oktatok;
			}


			public void setOktatok(List<Oktato> oktatok) {
				this.oktatok = oktatok;
			}


			@Override
			public String toString() {
				return "Tanszek [nev=" + nev + ", vezeto=" + vezeto + "]";
			}
			
			public void oktatoHozzaad(Oktato o) {
				if(o == null || this.oktatok.contains(o))  //ismétlõdés
					return;
				
				this.oktatok.add(o);
			}
			
			public void oktatoListaz() {
				for (Oktato o : oktatok) {
					System.out.println(o.toString());
				}
			}
			
		}
		
		
	}
	
	
}
