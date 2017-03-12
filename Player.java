import java.util.ArrayList;

public class Player{
  Card card;
  ArrayList<Card> cards;

  public Player(){
  this.cards = new ArrayList<Card>();

  }

  public void addCard(Card card){
    this.cards.add(card);
  }  

}