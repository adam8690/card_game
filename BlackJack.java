import java.util.ArrayList;

public class BlackJack implements Game{

  public String play(Player player1, Player player2){
    // set game up with new deck of cards. 
    ArrayList<Card> cards = new ArrayList<Card>();
    Deck deck = new Deck(cards);
    BlackJack blackJackGame = new BlackJack();
    deck.generate();

    // play game
    // Card card1 = deck.takeRandomCard();
    // Card card2 = deck.takeRandomCard();
    // Card card3 = deck.takeRandomCard();
    // Card card4 = deck.takeRandomCard();

    player1.addCard(deck.takeRandomCard());
    player2.addCard(deck.takeRandomCard());
    player1.addCard(deck.takeRandomCard());
    player2.addCard(deck.takeRandomCard());
    
    Player winner = this.highestPair(player1, player2);

    System.out.println("Winner of Highest Pair is: " + winner.name);

    return "BlackJack complete";
}  

  public Player highestPair(Player player1, Player player2){

    int p1Score = 0; 
    for (int i=0; i<player1.cards.size(); i++){
      p1Score = p1Score + player1.cards.get(i).value;
    }

    int p2Score = 0; 
    for (int i=0; i<player2.cards.size(); i++){
      p2Score = p2Score + player2.cards.get(i).value;
    }

    if (p1Score > p2Score){
      return player1;
    }
    else if (p1Score < p2Score){
      return player2;
    }
    else{
      return null;
    } 
  }

}