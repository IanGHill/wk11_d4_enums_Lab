import com.codeclan.example.Player;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

  private Deck deck1;
  private Deck shuffledDeck;
  private Player player1;

  @Before
  public void before(){
    deck1 = new Deck();
    shuffledDeck = new Deck();
    player1 = new Player();
  }

  @Test
  public void deckStartsEmpty(){
    assertEquals(0, deck1.getCardCount());
  }

  @Test
  public void canPopulateDeck(){
    deck1.populate();
    assertEquals(52, deck1.getCardCount());
  }

  @Test
  public void canShuffleDeck(){
    deck1.populate();
    System.out.println(deck1);
    deck1.shuffle();
    System.out.println(deck1);
    assertEquals(52, deck1.getCardCount());
  }

  @Test
  public void canDealCard(){
    deck1.dealCard(player1);

    assertEquals(51, deck1.getCardCount());

  }
}
