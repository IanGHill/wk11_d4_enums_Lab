import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Deck {

  private ArrayList<Card> cards;
  private Card card;
  private Suit suit;

  public Deck() {
    cards = new ArrayList<Card>();
  }

  public int getCardCount() {
    return cards.size();
  }

  public void populate() {
    for (Suit suit : Suit.values()){
      for (Rank rank : Rank.values()){
        card = new Card(suit, rank);
        cards.add(card);
      }
    }
  }

  public void shuffle() {
    Collections.shuffle(cards);
  }

  public void dealCard(Player player1) {

  }
}
