
public class SelfDivisor //Score: 3.5/4
{
	int number = 0;
	
	public static boolean isSelfDivisor(int number)
	{
		boolean isit = true;
		char where = 'a';
		
		if(number > 0)
		{
			for(int i = 0; i < String.valueOf(number).length(); i++)
			{
				where = String.valueOf(number).charAt(i);
			
				if(((float)number / (float)where) % 1 != 0)
				{
					isit = false;
				}
			}
		}
		
		return isit;
	}
	
	public static int[] firstNumSelfDivisors(int start, int number) //Score: 5/5
	{
		 int[] values = new int[number];
		 int amount = 0;
		 int next = start;
		 
		 for(int i = 0; i < number; i++)
		 {
			 while(!isSelfDivisor(next))
			 {
				 next++;
			 }
			 
			 values[amount] = next;
			 next++;
			 amount++;
		 }
		 
		 return values;
	}
}
