package factory;

public class Circle implements IShape {
	private double r;

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + "]";
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double getTerulet() {
		return r * r * Math.PI;
	}

	@Override
	public double getKerulet() {
		return 2 * r * Math.PI;
	}
	
	
	
	
	
}
