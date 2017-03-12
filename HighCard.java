import java.util.ArrayList;

public class HighCard implements Game{

  public String play(Player player1, Player player2){
    // set up game with new deck.
    ArrayList<Card> cards = new ArrayList<Card>();
    Deck deck = new Deck(cards);
    HighCard highCardGame = new HighCard();
    deck.generate();
    // play the game
    Card card1 = deck.takeRandomCard();
    System.out.println(card1.getFaceValue() + " " + card1.suit);
    Card card2 = deck.takeRandomCard();
    System.out.println(card2.getFaceValue() + " " + card1.suit);
    player1.addCard(card1);
    player2.addCard(card2);
    Player winner = this.highestCard(player1, player2);

    System.out.println("Winner of High Card is: " + winner.name);

    return "The game played!";
  }  

  public Player highestCard(Player player1, Player player2){
    if ( player1.cards.get(0).value > player2.cards.get(0).value ){
      return player1; 
    }
    else if ( player1.cards.get(0).value < player2.cards.get(0).value ){
      return player2;
    }
      return null;
        // returns null if a draw. how to return smething better than null and not error because a player wasn't returned?
  }

}