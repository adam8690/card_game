public class Card{
  public Integer value;
  public String suit;


  public Card(Integer value, String suit){
    this.value = value;
    this.suit = suit;
  }

public String getFaceValue(){
  Integer cardNumber = value; 
  switch(cardNumber){
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