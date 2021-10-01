package labproject2.prob1;

public class TestWeeklyTemps 
{

	public static void main(String[] args) 
	{
		double[] temps = {66.5, 109.5, 4.132, 82.6, 95, 5, 55.2};
		
		WeeklyTemps lastWeek = new WeeklyTemps();
		
		System.out.println("Weekly Temperature Data (degrees F):");
		
		System.out.printf("\tmean:\t %.1f", lastWeek.getMean(temps));
		System.out.println();
		System.out.println("\trange:\t" + lastWeek.getRangeStr(temps));
		System.out.print("\textreme temp days:\t" + lastWeek.getExtreme(temps));
		

	}

}
