package Shape;
/**
 * @author Derek Yu
 * Created 10/16/2017
 * Lab 2.1 shapes
 *
 */
public class Square extends Rectangle 
{
	double side;
	public Square(double side)
	{
		super(side, side);
		this.side = side;
	}
	public String toString() 
	{
		return "Square side: " + side + " Area: " + this.calculateArea() + " Perimeter: "
				+ this.calculatePerimeter();
	}
}
