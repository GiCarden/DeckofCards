package card_package;

/**
 * Generic card class.
 */
public class Card<S, R> {

//Variable(s)-
    private S suit;
    private R rank;

//Constructor(s)-
    public Card(S suit, R rank) { this.suit = suit; this.rank = rank; }

//Public Overridden Method(s)-
    @Override
    public String toString() { return String.format("\n%s of %s\n",rank,suit); }

}//End of Class.
