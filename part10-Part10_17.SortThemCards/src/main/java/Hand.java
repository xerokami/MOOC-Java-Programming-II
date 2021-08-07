import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        hand.forEach(card -> System.out.println(card));
    }

    public void sort() {
        Collections.sort(hand);
    }

    public int compare(Card c1, Card c2) {
        return c1.getSuit().ordinal() - c2.getSuit().ordinal();
    }

    @Override
    public int compareTo(Hand o) {
        int thisHandValue = this.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);

        int comparedHandValue = o.hand.stream()
                .map(card -> card.getValue())
                .reduce(0, (a, b) -> a + b);

        return thisHandValue - comparedHandValue;
    }
}
