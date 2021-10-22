package labproject4.prob1;

/**
 * Your name: Connor Bennett
 * 
 * Construct 52 PlayingCards and add them to a deck.
 * 
 * **NOTE**: Read all comments below thoroughly.
 */

public class TestPlayingCard
{
    public static void main(String[] args)
    {
        // 1 - Construct an array of 52 PlayingCard objects called deck.

    	String[][] deck = new String[14][5];
    	
    	PlayingCard set = new PlayingCard(0,0);

        // 2 - Construct the 52 PlayingCards in a standard deck of cards
        //     (https://en.wikipedia.org/wiki/Standard_52-card_deck)
        //     and add them to the deck. You must use a loop (or
        //     nested loops).
    	//value: 1-13
    	//suit: 1-4
    	// 3 - Display the value and suit of every PlayingCard in the deck.
        //     You must use a loops
        
    	for (int num = 1; num < 14; num++)
    	{
    		for(int suits = 1; suits<5; suits++)
    		{
    			set.setSuit(suits);
    			set.setValue(num);
    			deck[num][suits] = set.toString();	
    			System.out.print(deck[num][suits] + "\t\t");
    		}
    		System.out.println();
    		
    	}
    	
    	//I condensed steps 2 and 3 for a simpler traversion to alter the array and print the desired results
        
 
    }
}
