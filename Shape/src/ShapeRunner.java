
public class ShapeRunner {

	public static void main (String [] args)
	{
		Rectangle rect = new Rectangle(5,3);
		Circle circ = new Circle(3);
		if(rect.area > circ.circumference)
		{
			System.out.println("The area of the rectangle is greater");
		}
		else
		{
			System.out.println("The area of the circle is greater.");
		}
		
	}

}
