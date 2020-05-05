import java.util.ArrayList;

public class Trip 
{
	private ArrayList<Flight> flights;
	
	public int getDuration()
	{
		int minutes = 0;
		
		if(flights.size() > 0)
		{
			Flight first = flights.get(0);
			Flight last = flights.get(flights.size() - 1);
			
			Time begin = first.getDepartureTime();
			Time end = last.getArrivalTime();
			
			minutes = begin.minutesUntil(end);
		}
		
		return minutes;
	}
	
	public int getShortestLayover()
	{
		int shortest = -1;
		int test = 0;
		
		if(flights.size() >= 2)
		{
			Flight init1 = flights.get(0);
			Flight init2 = flights.get(1);
			Time tInit1 = init1.getArrivalTime();
			Time tInit2 = init2.getDepartureTime();
			shortest = tInit1.minutesUntil(tInit2);
			
			for(int i = 0; i < flights.size() - 1; i++)
			{
				Flight first = flights.get(i);
				Flight second = flights.get(i + 1);
				Time time1 = init1.getArrivalTime();
				Time time2 = init2.getDepartureTime();
				test = time1.minutesUntil(time2);
				
				if(test < shortest)
				{
					shortest = test;
				}
			}
		}
		
		return shortest;
	}
}
