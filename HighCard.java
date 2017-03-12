import java.util.ArrayList;

public class HighCard implements Game{

  public String play(){
    // run game methods here
    ArrayList<Card> cards = new ArrayList<Card>();
    Deck deck = new Deck(cards);
    Player player1 = new Player();
    Player player2 = new Player();
    HighCard highCardGame = new HighCard();

    deck.generate();
    Card card1 = deck.takeRandomCard();
    System.out.println(card1.value);
    System.out.println(card1.suit);
    Card card2 = deck.takeRandomCard();
    System.out.println(card2.value);
    System.out.println(card2.suit);
    player1.addCard(card1);
    player2.addCard(card2);
    Player winner = this.highestCard(player1, player2);


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