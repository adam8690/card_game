import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BlackJackTest{
  Card card;

@Before
public void before(){
  card = new Card(11, "Hearts");
}

@Test
public void cardIsCreated(){
  assertEquals("Hearts", card.suit);
}

@Test
public void cardFaceMethod(){
  assertEquals("Jack", card.getFaceValue());
}

}