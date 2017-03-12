import static org.junit.Assert.assertEquals;
import org.junit.*;
import java.util.ArrayList;


public class BlackJackTest{
  Card card;
  Card card2;
  Card card3;
  Deck deck;
  Deck newDeck;
  ArrayList<Card> cards;
  Player player;

  @Before
  public void before(){
    card = new Card(11, Suit.HEARTS);
    card2 = new Card(5, Suit.DIAMONDS);
    card3 = new Card(14, Suit.CLUBS);
    cards = new ArrayList<Card>();
    deck = new Deck(cards);
    player = new Player();
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
    // first card: for loop should create 2 of diamonds first. 
    int cardValueFirst = deck.showCard(0).value;
    assertEquals(cardValueFirst, 2);
    Suit cardSuitFirst = deck.showCard(0).suit;
    assertEquals(cardSuitFirst, Suit.DIAMONDS);
    // last card: for loop should create ace of spades last.
    int cardValueLast = deck.showCard(51).value;
    assertEquals(cardValueLast, 14);
    Suit cardSuitLast = deck.showCard(51).suit;
    assertEquals(cardSuitLast, Suit.SPADES);
    
  }

  @Test 
  public void canTakeCard(){
    deck.generate();
    card = deck.takeRandomCard();
    card2 = deck.takeRandomCard();
    System.out.println(card.value);
    System.out.println(card.suit);

    System.out.println(card2.value);
    System.out.println(card2.suit);
    
    assertEquals(deck.cards.size(), 50);
  }

  @Test
  public void playerCanTakeCard(){
    deck.generate();
    card = deck.takeRandomCard();
    player.addCard(card);
    assertEquals(player.cards.size(), 1);
  }

}