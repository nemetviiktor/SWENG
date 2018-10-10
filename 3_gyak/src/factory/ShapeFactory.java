package factory;

public class ShapeFactory {
	
	   public IShape getShape(String shapeType){
		      if(shapeType == null){
		         return null;
		      }         
		      if(shapeType.equalsIgnoreCase("CIRCLE")){
		         return new Circle(5);
		         
		      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
		         return new Rectangle(5, 6);
		         
		      } else if(shapeType.equalsIgnoreCase("SQUARE")){
		         return new Square(7);
		      }
		      
		      return null;
		   }


}
