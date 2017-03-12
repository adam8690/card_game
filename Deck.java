import java.util.ArrayList;
import java.util.Random;

public class Deck{
  public Card card;
  public ArrayList<Card> cards;
  private Random rn;


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

  public Card takeRandomCard(){
    // check if there are any cards in deck.
    if (cards.size() > 0){
    // generate a random integer between 0 and the size of the array - 1 to get the index of the card to be removed. 
    rn = new Random();
    Integer random = rn.nextInt(cards.size() - 1);
    // set card variable to be found card object. 
    card = showCard(random); 
    cards.remove(card);
    // return the card that is removed.
    return card;
  }
  // no cards left, return null. What to do when null is returned?
    else{ 
      return null;
    } 

  // will return card if there is a card in the deck. or null if not. may need a throw/catch here to deal with null card being returned.
  }

}
