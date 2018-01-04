public class Rectangle{

	public double side1;
	
	public double side2;

	private double perimeter;

	private double area;

	private double diagonal;

	public Rectangle(double l1, double l2){
		
		side1 = l1;

		side2 = l2;
	
	}

	public double getPerimeter(double l1, double l2){

		perimeter = 2 * l1 + 2 * l2;
		return perimeter;
	}

	public double getArea(double l1, double l2){

		area = l1 * l2;
		return area;
	}

	public double getDiagonal(double l1, double l2){
		
		diagonal = Math.sqrt(Math.pow(l1,2) + Math.pow(l2,2));
		return diagonal;

	}





}
