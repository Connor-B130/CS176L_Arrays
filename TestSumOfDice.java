package labproject3.prob1;

public class TestSumOfDice 
{

	public static void main(String[] args) 
	{
		
		SumOfDice simulate = new SumOfDice();

		simulate.rollDice();
		simulate.occurenceChart();
		simulate.frequencyChart();
	}

}
