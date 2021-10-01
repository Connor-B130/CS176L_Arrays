package labproject2.prob1;

public class WeeklyTemps 
{
	
	public double getMax(double [] temps)
	{
		double max = temps[0];
		for(int i = 0; i < temps.length; i++)
		{
			if(max <= temps[i])
			{
				max = temps[i];
			}
		}
		return max;
	}
	
	public double getMin(double[] temps)
	{
		double min = temps[0];
		for(int i = 0; i < temps.length; i++)
		{
			if(min >= temps[i])
			{
				min = temps[i];
			}
		}
		return min;
	}
	
	public String getRangeStr(double[] temps)
	{
		double min = getMin(temps);
		double max = getMax(temps);
		
		String range = String.format("%.1f - %.1f", min, max);
		return range;
	}
	
	public double getMean(double[] temps)
	{
		double mean = 0;
		for(int i = 0; i < temps.length; i++)
		{
			mean += temps[i];
		}
		mean = (mean/temps.length);
		return mean;
	}
	
	public int getExtreme(double[] temps)
	{
		int extreme = 0;
		
		for(double element : temps)
		{
			if(element >= 95 || element <= 5)
			{
				extreme++;
			}
		}
		return extreme;
	}
	
}
