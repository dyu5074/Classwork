package arrays;

public class Doubles {
	public static void main (String [] args)
	{
		String [] array = {"ham" , "cheese", "eggs"};
		String [] c = doubled(array);
		String a = "bar";
		String b = doubled(a);
		int x = 5; 
		int y = doubled(x);
		System.out.println(x);
		System.out.println(y);
		System.out.println(a);
		System.out.println(b);
		printArr(array);
		printArr(c);
	}
	public static String doubled (String str1)
	{
		str1 = str1 + str1; 
		return str1;
	}
	public static int doubled (int x)
	{
		x = x + x;
		return x;
	}
	public static String[] doubled (String [] strArr)
	{
		for (int i = 0; i < strArr.length; i++)
		{
			strArr[i] = strArr[i] + strArr[i];
		}
		return strArr;
	}
	private static void printArr(Object[] arr)
	{
		for (Object x : arr)
		{
			System.out.println(x);
		}
	}
}
