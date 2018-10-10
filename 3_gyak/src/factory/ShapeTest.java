package factory;

public class ShapeTest {
	
	 public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      IShape shape1 = shapeFactory.getShape("CIRCLE");
	      System.out.println("A kor terulete: " + shape1.getKerulet() + " terulete: " + shape1.getTerulet());

	      IShape shape2 = shapeFactory.getShape("RECTANGLE");
	      System.out.println("A teglalap terulete: " + shape2.getKerulet() + " terulete: " + shape2.getTerulet());
	      
	      
	      IShape shape3 = shapeFactory.getShape("SQUARE");
	      System.out.println("A negyzet terulete: " + shape3.getKerulet() + " terulete: " + shape3.getTerulet());
	      
	   }
	}
