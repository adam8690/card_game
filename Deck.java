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

  // public Arraylist<Card> generateDeck(){
  //   // String suitsArray = new String[4];

  //   // suitsArray = ["Hearts", "Diamonds", "Clubs", "Spades"]
  //   // for (String suit:suitsArray){
  //   //   for(
  //   }
}
