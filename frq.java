
public class frq 
{
	public boolean simulate()
	{
		boolean reached = false;
		int i = 0;
		int distance = 0;
		
		
		while(i < maxHops || distance < 0)
		{
			distance += hopDistance();
			i++;
			
			if(distance >= goalDistance)
			{
				reached = true;
			}
		}

		return reached;
	}
	
	public double runSimulations(int num)
	{
		double proportion = 0;
		int i = 0;
		int completed = 0;
		
		if(num > 0)
		{
			for(i = 0; i < num; i++)
			{
				if(simulate())
				{
					completed++;
				}
			}
		}
		
		proportion = completed / i;
		
		return proportion;
	}
}
