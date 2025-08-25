public class RectangleDemo {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5, 10);
		
		System.out.println(Rectangle.getNumRectangles());

		Rectangle r3;
		System.out.println("After r3 is declared: " + Rectangle.getNumRectangles());
		r3 = new Rectangle(1.5, 3);
		System.out.println("After r3 is instantiated: " + Rectangle.getNumRectangles());
		
		System.out.println("The areas of the rectangles are: " 
							+ "\nr1 -> " + r1.area()
							+ "\nr2 -> " + r2.area()
							+ "\nr3 -> " + r3.area()
		);

		System.out.println("The perimeters of the rectangles are: " 
							+ "\nr1 -> " + r1.perimeter()
							+ "\nr2 -> " + r2.perimeter()
							+ "\nr3 -> " + r3.perimeter()
		);
	}
}
