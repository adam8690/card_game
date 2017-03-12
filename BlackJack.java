public class BlackJack implements Game{

  public String play(Player player1, Player player2){
    // set game up with new deck of cards. 
    ArrayList<Card> cards = new ArrayList<Card>();
    Deck deck = new Deck(cards);
    BlackJack blackJackGame = new BlackJack();
    deck.generate();

    // play game
    Card card1 = deck.takeRandomCard();
    Card card2 = deck.takeRandomCard();
    Card card3 = deck.takeRandomCard();
    Card card4 = deck.takeRandomCard();

    player1.addcard(card1);
    player1.addcard(card3);
    player2.addcard(card2);
    player2.addcard(card4);




    return "BlackJack complete";
}  

  public Player highestPair(){
    
  }

}