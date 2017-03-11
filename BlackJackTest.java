import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.ArrayList;


public class BlackJackTest{
  Card card;
  Card card2;
  Card card3;
  Card firstCard;
  Card lastCard;
  Deck deck;
  ArrayList<Card> cards;

  @Before
  public void before(){
    card = new Card(11, Suit.HEARTS);
    card2 = new Card(5, Suit.DIAMONDS);
    card3 = new Card(14, Suit.CLUBS);
    // for testing the ordered generation of a deck the first card in generated will be 2 of diamonds and the last will be the Ace of spades.
    firstCard = new Card(2, Suit.DIAMONDS);
    lastCard = new Card(14, Suit.SPADES);
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

  @Test
  public void testCanGenerateOrderedDeck(){
    deck.generate();
    assertEquals(deck.showCard(0), firstCard);
    assertEquals(deck.showCard(0), lastCard);
  }

}