import java.util.ArrayList;

public class CardDealer
{
		
    public static void main(String[] args)
    {
    	// sets the suits and values of the cards
    	String[] suits = new String[]{"red", "blue", "green", "yellow"};
    	int[] values = new int[]{1,2,3,4,5,6,7,8,9,10};

		// creates the deck of cards
    	ArrayList<Card> Deck = new ArrayList<Card>();
    	for(String test : suits)
    	{
    		for(int temp : values)
    		{
    			Card t = new Card (test, temp);
    			Deck.add(t);
    		}
    	}
    	
		// prints the deck of cards
		System.out.println("\n ====================== Unshuffled Deck ======================");
    	for(Card temp : Deck)
    	{
    		System.out.println(temp);
    	}
    	System.out.println("");
    	
		// randomly shuffles the deck
		java.util.Collections.shuffle(Deck);
		
		// prints the shuffled deck
		System.out.println(" ====================== Shuffled Deck ======================");
		for(Card temp : Deck)
		{
			System.out.println(temp);
		}
		System.out.println("");
    	
    	
    	// deals 7 cards to each of 3 player
    	ArrayList<Card> Player1 = new ArrayList<Card>();
    	ArrayList<Card> Player2 = new ArrayList<Card>();
    	ArrayList<Card> Player3 = new ArrayList<Card>();
		for(int i = 0; i < 7; i++)
		{
			Player1.add(Deck.remove(0));
			Player2.add(Deck.remove(0));
			Player3.add(Deck.remove(0));
		}
    	
		// prints the hands of the players
		System.out.println(" ====================== Player Hands ======================");
    	System.out.println("Player One " + Player1);
    	System.out.println("Player Two " + Player2);
    	System.out.println("Player Three " + Player3);
    }
    
}
