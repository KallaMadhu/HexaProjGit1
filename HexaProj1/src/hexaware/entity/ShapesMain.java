package hexaware.entity;

public class ShapesMain {

	public static void main(String[] args) {
		
		Rectangle rect=new Rectangle();
		Circle circle=new Circle();
		rect.draw();
		rect.info();
		circle.draw();
		circle.info();
		
		Shape.get();

	}

}
