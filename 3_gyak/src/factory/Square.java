package factory;

public class Square implements IShape{

	private double a;

	public Square(double a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "Square [a=" + a + "]";
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double getTerulet() {
		return Math.pow(this.a, 2);
	}

	@Override
	public double getKerulet() {
		return 2 * this.a;
	}
	
	
}
