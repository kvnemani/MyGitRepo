
public class FindArea {

	double width;
	double height;

	public FindArea(double width, double height) {

		this.width = width;
		this.height = height;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle(10, 20);
		Triangle t = new Triangle(20, 10);
		System.out.println("Aread of Rectangle is :" + r.computeArea());

		System.out.println("Area of traingle is : " + t.computeArea());

	}

}

class Rectangle {

	double length;
	double breadth;

	public Rectangle(double length, double breadth) {

		// TODO Auto-generated constructor stub
		this.length = length;
		this.breadth = breadth;
	}

	public double computeArea() {
		return length * breadth;
	}

}

class Triangle {

	double width;
	double height;

	public Triangle(double width, double height) {

		// TODO Auto-generated constructor stub
		this.width = width;
		this.height = height;
	}

	public double computeArea() {
		return (width * height) / 2;
	}

}
