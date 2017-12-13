package listremoveduplicate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class removeduplicate {
	public static void main (String[] args)
	{
		List<Integer> test1 = new ArrayList<Integer>();
		test1.add(5);
		test1.add(5);
		test1.add(10);
		test1.add(26);
		test1 = removeduplicates(test1);
		System.out.println(test1);
	}
	public static List<Integer> removeduplicates(List<Integer> nums)
	{
		Collections.sort(nums);
		for(Integer i = 0; i < nums.size();i++)
		{
			Integer x = nums.get(i);
			for (Integer j = i + 1; j < nums.size();j++)
			{
				if (x == nums.get(j))
				{
					nums.remove(j);
				}
			}
		}
		return nums;
	}
}
