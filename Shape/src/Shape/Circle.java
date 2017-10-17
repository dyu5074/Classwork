package Shape;

public class Circle implements Shape{
	private double radius;
	private static double pi = 3.14;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double perimeter() 
	{
		return (2 * radius * pi);
	}
	public double calculatearea()
	{
		return (radius * radius * pi);
	}
}
