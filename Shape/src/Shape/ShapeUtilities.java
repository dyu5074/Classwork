package Shape;
/**
 * @author Derek Yu
 * Created 10/16/2017
 * Lab 2.1 shapes
 *
 */
import java.util.Random;
public class ShapeUtilities{
	public static double sumPerimeter(Shape[] ShapeArr)
	{
		double sump = 0;
		for (int i = 0; i < ShapeArr.length; i++)
		{
			sump += ShapeArr[i].calculatePerimeter();
		}
		return sump;
	}
	public static double sumArea(Shape[] ShapeArr)
	{
		double suma = 0;
		for (int i = 0; i < ShapeArr.length; i++)
		{
			suma += ShapeArr[i].calculateArea();
		}
		return suma;
	}
	public static Shape randomShape()
	{
		Random r = new Random();
		int x = r.nextInt(3);
		switch(x)
		{
			case 0:
				return new Circle(r.nextInt(100));
			case 1 :
				return new Rectangle(r.nextInt(50), r.nextInt(50));
			case 2 : 
				return new Square(r.nextInt(50));
			default :
				return new Circle(r.nextInt(100));
		}
	}
}
