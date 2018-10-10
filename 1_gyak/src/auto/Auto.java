package auto;

public class Auto {

	private String manufacturer;
	private String tipus;
	private final int gyartasiev;
	private String motortipus;
	private String uzemanyag;
	private double atlagfogyasztas;
	
	public Auto(String manufacturer, String tipus, int gyartasiev, String motortipus) {
		this.manufacturer = manufacturer;
		this.tipus = tipus;
		this.gyartasiev = gyartasiev;
		this.motortipus = motortipus;
		this.uzemanyag = "benzin";
		this.atlagfogyasztas = calculateFuelConsumption(motortipus);
	}
	
	
	public Auto(String manufacturer, String tipus, int gyartasiev, String motortipus, String uzemanyag,
			double atlagfogyasztas) {
		super();
		this.manufacturer = manufacturer;
		this.tipus = tipus;
		this.gyartasiev = gyartasiev;
		this.motortipus = motortipus;
		this.uzemanyag = uzemanyag;
		this.atlagfogyasztas = atlagfogyasztas;
	}




	public double calculateFuelConsumption(String manufacturer) {
		switch (manufacturer) {
		case "1.4";
			return 6.5;
		case "1.8";
			return 7.0;
		case "2.0";
			return 8.0;
		default:
			return 0;
		}
	}
	
	
	

}
