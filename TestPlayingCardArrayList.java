package labproject4.prob1;

import java.util.ArrayList;

public class TestPlayingCardArrayList 
{

	public static void main(String[] args) 
	{
		ArrayList<String> deck = new ArrayList<>();

     	PlayingCard set = new PlayingCard(0,0);

    	for(int num = 1; num < 14; num++)
    	{
    		for(int suits = 1; suits < 5; suits++)
    		{
    			set.setSuit(suits);
    			set.setValue(num);
    			deck.add(set.toString());
    			System.out.print(set.toString() + "\t\t");
    		}
    		System.out.println();
    	}
	}

}
