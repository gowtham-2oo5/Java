package prob34;

public class GeometricShape {
	String borderColor;
	boolean filled;
	GeometricShape(String borderColor,boolean filled)
	{
		setBorderColor(borderColor);
		setFilled(filled);
	}
	void setBorderColor(String borderColor) {
		this.borderColor=borderColor;
	}
	void setFilled(boolean filled) {
		this.filled=filled;
	}
	String getBorderColor() {
		return "Border Color: "+borderColor;
	}
	String getFilled() {
		if(filled==true)
			return "Color is filled";
		return "Color not filled";
	}
	double area() {
		return 0;
	}
	public String toString() {
		return getBorderColor()+"\n"+getFilled();
	}
}
