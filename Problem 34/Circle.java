package prob34;

public class Circle extends GeometricShape{
	double radius;
	Circle(double radius){
		super("Red",false);
		setRadius(radius);
	}
	void setRadius(double radius) {
		this.radius=radius;
	}
	String getRadius() {
		return "Radius: "+radius;
	}
	double area() {
		System.out.println("Geometric Shape: "+super.area());
		return (Math.PI*radius*radius);
	}
	public String toString() {
		System.out.println("Circle");
		System.out.println(super.toString());
		return getRadius();
	}
}
