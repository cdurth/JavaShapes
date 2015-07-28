public interface Shape extends Comparable<Shape> {
	// Getters and setters. Height and width must be equal for Squares and Circles
	public double getHeight();
	public double getWidth();
	public void setHeight(double newHeight);
	public void setWidth(double newWidth);
	
	// Compute area based on height and width
	public double area();
	// Compare areas to see which shape is bigger
	public int compareTo(Shape otherShape);
}