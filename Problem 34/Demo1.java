package prob34;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec=new Rectangle(10,30);
		Circle cir=new Circle(5);
		System.out.println(rec.toString());
		System.out.println(cir.toString());
		System.out.println("--------------------");
		System.out.println("Area ");
		System.out.println("Rectangle ");
		System.out.println("Area of Rectangle: "+ rec.area());
		System.out.println("Circle ");
		System.out.println("Area of Circle: "+cir.area());
	}

}
