package shapes;

public class Rectangle {
	//fields
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	//methods
	public Rectangle() {
		this.length=1;
		this.width=1;
	}
	
	public Rectangle(double side) {
		this.length=side;
		this.width=side;
	}
	
	public Rectangle(double length, double width) {

	}
	
	private double findPerimeter() {
		return 0;
	}
	
	private double findArea() {
		return 0;
	}
	
	public void printStats() {
		System.out.println("rectangle");
		System.out.println("Width = "+this.width*2);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}
	
	
}
