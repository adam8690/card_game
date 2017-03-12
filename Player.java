import java.util.ArrayList;

public class Player{
  Card card;
  ArrayList<Card> cards;
  String name;

  public Player(String name){
  this.cards = new ArrayList<Card>();
  this.name = name;
  }

  public void addCard(Card card){
    this.cards.add(card);
  }  

}