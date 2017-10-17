package Shape;
import java.util.Random;
public class ShapeUtilities{
	public static double sumPerimeter(Shape[] ShapeArr)
	{
		double sump = 0;
		for (int i = 0; i < ShapeArr.length; i++)
		{
			sump += ShapeArr[i].perimeter();
		}
		return sump;
	}
	public static double sumArea(Shape[] ShapeArr)
	{
		double suma = 0;
		for (int i = 0; i < ShapeArr.length; i++)
		{
			suma += ShapeArr[i].area();
		}
		return suma;
	}
	public static Shape getRandomShape()
	{
		Random r = new Random();
		int x = r.nextInt(3);
		switch(x)
		{
			case 0:
				return new Circle(r.nextInt(100));
			case 1 :
				return new rect(r.nextInt(100)+1);
			case 2 : 
				return new square(r.nextInt(100));
		}
	}
}
