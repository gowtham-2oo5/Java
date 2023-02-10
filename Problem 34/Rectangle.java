package prob34;

public class Rectangle extends GeometricShape {
	int len,wid;
	Rectangle(int len,int wid){
		super("Black",true);
		setLength(len);
		setWidth(wid);
	}
	void setLength(int len) {
		this.len=len;
	}
	void setWidth(int wid) {
		this.wid=wid;
	}
	String getLength() {
		return "Length: "+len;
	}
	String getWidth() {
		return "Width: "+wid;
	}
	double area() {
		System.out.println("Geometric Shape: "+super.area());
		return (len*wid);
	}
	public String toString() {
		System.out.println("Rectangle");
		System.out.println(super.toString());
		return getLength()+"\n"+getWidth();
	}
	
}
