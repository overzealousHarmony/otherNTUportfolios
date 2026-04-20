public class Square extends Shape
{
	private double width;
	
	public Square(double width) {
		this.width =width;
	}
	
	public double calculateArea() {
		return width*width;
	}	
}