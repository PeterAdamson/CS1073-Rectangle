/* Author Peter Adamson */

public class RectangleDriver{

	public static void main(String[] args){
		
		UserInterface ui = new UserInterface();

		double l1 = ui.promptforDouble1();
		double l2 = ui.promptforDouble2();

		Rectangle r = new Rectangle(l1, l2);



		System.out.println("Rectangle " + r.side1 + "cm by " + r.side2 + "cm has the following dimensions");
		System.out.println("Perimeter: " + r.getPerimeter(l1, l2) + "cm");
		System.out.println("Area: " + r.getArea(l1, l2) + "cm");
		System.out.println("Diagonal: " + r.getDiagonal(l1, l2) + "cm");

	}
}
