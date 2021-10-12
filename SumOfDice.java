package labproject3.prob1;

public class SumOfDice 
{
	private int[] diceSums = new int[12]; 
	
	public void rollDice()
	{
		for(int i = 0; i < 100; i++)
		{
			
			int roll1 = 1 + (int)(Math.random() * 6);
			int roll2 = 1 + (int)(Math.random() * 6);
			int totalRoll = roll1 + roll2;
			diceSums[totalRoll - 2] += 1;
		}
	}
	
	public void occurenceChart()
	{
		System.out.println("Sum of dice\toccurences" );
		System.out.println("-----------\t----------" );
		for( int i = 0; i < diceSums.length - 1; i++)
		{
			System.out.println((i + 2) + " \t \t" + diceSums[i]);
		}
	}
	
	public void frequencyChart()
	{
		System.out.println("Dice Sums: (100 Rolls)" );
		for( int i = 0; i < diceSums.length - 1; i++)
		{
			System.out.print((i + 2)+ ": \t ");
			for(int j = 0; j < diceSums[i]; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}