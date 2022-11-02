package prob6;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;
	
	public Rectangle(double w, double h) {
		this.width = w;
		this.height = h;
	}
	@Override
	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;
	}
	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return (width + height) * 2;
	}
	
}
