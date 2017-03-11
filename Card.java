public class Card{
  public Integer value;
  public Suit suit;


  public Card(Integer value, Suit suit){
    this.value = value;
    this.suit = suit;
  }

public String getFaceValue(){

  switch(value){
    case 11:
    return "Jack";    

    case 12:
    return "Queen";
    
    case 13:
    return "King";

    case 14:
    return "Ace";
    // Aces High
    default:
    return Integer.toString(value);
  }

}


}