package bank;

public class Bankkartya {
	private String tulaj;
	private int egyenleg;
	private int limit;
	
	
	private Bankkartya() {
		this.limit = 100000;
	}


	public Bankkartya(String tulaj, int egyenleg, int limit) {
		super();
		this.tulaj = tulaj;
		this.egyenleg = egyenleg;
		this.limit = limit;
	}


	public Bankkartya(String tulaj, int egyenleg) {
		this();        //a private konstruktorra illeszkedik, osztályon belül, mert a priv. kon. paraméter nélküli
		this.tulaj = tulaj;
		this.egyenleg = egyenleg;
	}
	
	public boolean penzFelvet(int osszeg) {
		if(osszeg > this.limit) {
			return false;
		}else if(osszeg <= this.limit) {
			this.egyenleg = this.egyenleg - osszeg;
			return true;
		}
		
		return false;
	}


	public int getEgyenleg() {
		return egyenleg;
	}


	@Override
	public String toString() {
		return "Bankkartya [tulaj=" + tulaj + ", egyenleg=" + egyenleg + ", limit=" + limit + "]";
	}
	
	
	
	
	
	

}
