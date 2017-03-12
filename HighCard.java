public class HighCard implements Game{

  public String play(){
    // run game methods here

    return "This will eventually run the game";
  }  

  public Player highestCard(Player player1, Player player2){
    if ( player1.cards.get(0).value > player2.cards.get(0).value ){
      return player1; 
    }
    else if ( player1.cards.get(0).value < player2.cards.get(0).value ){
      return player2;
    }
      return null;
        // returns null if a draw. how to return smething better than null and not error because a string draw was returned?
  }

}