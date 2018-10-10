package factory;

public class Rectangle implements IShape{

	private double a;
	private double b;
	
	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + a + ", b=" + b + "]";
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	@Override
	public double getTerulet() {
		return this.a * this.b;
	}

	@Override
	public double getKerulet() {
		return 2 * this.a + 2 * this.b;
	}



	
	
	

	
	
	
	
	
	
	
	
}
