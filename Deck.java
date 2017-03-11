import java.util.ArrayList;

public class Deck{
  public Card card;
  public ArrayList<Card> cards;


  public Deck(ArrayList<Card> cards){
    this.cards = cards;
  }

  public void addCard(Card card){
    cards.add(card);
  }

  public Card showCard(Integer position){
    return cards.get(position);
  }

  public Deck generate(){
    Suit[] suits = {Suit.DIAMONDS, Suit.HEARTS, Suit.CLUBS, Suit.SPADES};
    for (int i = 0; i < suits.length; i++){
      for (int j = 2; j < 15; j++){
        card = new Card(j, suits[i]);
        this.addCard(card);
      }
    }
  return this;
  }

  // public Arraylist<Card> generateDeck(){
  //   // String suitsArray = new String[4];

  //   // suitsArray = ["Hearts", "Diamonds", "Clubs", "Spades"]
  //   // for (String suit:suitsArray){
  //   //   for(
  //   }
}
