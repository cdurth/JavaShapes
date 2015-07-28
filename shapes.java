
public class shapes implements Shape {
	private double height;
	private double width;
	private double area;
	
	public double getHeight() {
		return height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setHeight(double newHeight) {
		height = newHeight;
	}
	
	public void setWidth(double newWidth) {
		width = newWidth;
	}
	
	public double area() {
		return area;
	}
	
	public int compareTo(Shape otherShape) {
		if (area() > otherShape.area()){
			return 1;
		} else {
			return -1;
		}
	}
}