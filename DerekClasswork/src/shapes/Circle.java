package shapes;

import shapes.Shape;

/**
 * @author Derek Yu
 * Created 10/16/2017
 * Lab 2.1 shapes
 *
 */
public class Circle implements Shape
{
	//fields
	private double radius;
	private static double pi = 3.14;
	public Circle(double radius)
	{
		this.radius = radius;
	}
	public double calculatePerimeter() 
	{
		return (2 * radius * pi);
	}
	public double calculateArea()
	{
		return (radius * radius * pi);
	}
	public String toString() 
	{
		return "Circle Radius:  " + radius + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
