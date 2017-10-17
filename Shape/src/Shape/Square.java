package Shape;

public class Square implements Shape {
	private double side;
	public Square(double side)
	{
		this.side = side;
	}
	public double perimeter() 
	{
		return (side * 4);
	}
	public double area()
	{
		return (side * side);
	}
}
