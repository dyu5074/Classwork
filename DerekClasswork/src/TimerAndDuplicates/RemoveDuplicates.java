package TimerAndDuplicates;

public class RemoveDuplicates {
	public static void main (String [] args)
	{
		int [] test1 = {1, 4, 4, 5, 2, 4, 2, 5};
		int [] test2 = {34, 2, 7, 7, 7};
		int [] test3 = {};
	
		long startTime = System.nanoTime(); // records the startTime
		System.out.println(countUnique(test1)); // prints 4
		long endTime = System.nanoTime(); // records stopTime
		long totalTime = endTime - startTime; // calculates totalTime
		System.out.println("Time Taken in nanoseconds: " + totalTime);
		System.out.println(countUnique(test2)); // prints 3
		System.out.println(countUnique(test3)); // prints 0
	
	}
	public static int countUnique (int [] numbers)
	{
		int count = 0; 
		
		for (int i = 0; i < numbers.length; i++)
		{
			//Assume the number is unique at first
			boolean unique = true;
			//checks all the subsequent numbers
			for (int j = i + 1; j < numbers.length; j++)
			{
				if (numbers[i] == numbers[j])
				{
					unique = false; // if we found an equivalent number, unique is false;
					break; // no need to check the rest of the inner for loop
				}
			}
			// if unique stayed true, we add 1 to unique count
			if(unique)
			{
				count++;
			}
		}
		return count;
	}
}
