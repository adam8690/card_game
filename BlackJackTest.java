import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.ArrayList;


public class BlackJackTest{
  Card card;
  Card card2;
  Card card3;
  Deck deck;
  ArrayList<Card> cards;

@Before
public void before(){
  card = new Card(11, Suit.HEARTS);
  card2 = new Card(5, Suit.DIAMONDS);
  card3 = new Card(14, Suit.CLUBS);
  cards = new ArrayList<Card>();
  deck = new Deck(cards);
}

@Test
public void testCardIsCreated(){
  assertEquals("HEARTS", card.suit.toString());
}

@Test
public void testCardFaceMethod(){
  assertEquals("Jack", card.getFaceValue());
  assertEquals("5", card2.getFaceValue());
  assertEquals("Ace", card3.getFaceValue());
}

@Test 
public void testCardAddedToDeck(){
  deck.addCard(card);
  assertEquals(card, deck.showCard(0));
}

}