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
  Player player1;
  Player player2;
  HighCard highCardGame;

  @Before
  public void before(){
    card = new Card(11, Suit.HEARTS);
    card2 = new Card(5, Suit.DIAMONDS);
    card3 = new Card(14, Suit.CLUBS);
    cards = new ArrayList<Card>();
    deck = new Deck(cards);
    player1 = new Player("Adam");
    player2 = new Player("House");
    highCardGame = new HighCard();
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
    // System.out.println(card.value);
    // System.out.println(card.suit);

    // System.out.println(card2.value);
    // System.out.println(card2.suit);
    
    assertEquals(deck.cards.size(), 50);
  }

  @Test
  public void playerCanTakeCard(){
    assertEquals(player1.cards.size(), 0);
    deck.generate();
    card = deck.takeRandomCard();
    player1.addCard(card);
    assertEquals(player1.cards.size(), 1);
  }

  @Test
  public void testHighestCardSelected(){
    // card1 - Jack of hearts
    player1.addCard(card);
    // card2 - 5 of Diamonds
    player2.addCard(card2);
    assertEquals(highCardGame.highestCard(player1, player2), player1);
  }

  @Test
  public void testGamePlayed(){
    assertEquals(highCardGame.play(player1, player2), "The game played!");
    // if the game is a draw, null will be returned, also not testing if the correct winner is returned.
  }

}