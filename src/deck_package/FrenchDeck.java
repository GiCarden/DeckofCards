package deck_package;

import card_package.Card;
import card_package.FrenchSuit;
import card_package.Rank;

/**
 * French playing card(s) class.
 *
 * A deck of French playing cards is the most common deck of playing cards used today. It consists of 52 Cards in
 * each of the 4 suits of Spades, Hearts, Diamonds, and Clubs. Each suite contains 13 cards: Ace, 2, 3, 4, 5, 6,
 * 7, 8, 9, 10, Jack, Queen, King.
 */
public class FrenchDeck extends Deck {

//Constructor(s)-
    /**
     * Calls its superclass constructor.
     */
    public FrenchDeck() { super(); }

//Public Overridden Method(s)-
    /**
     * Overridden method to fill the deck with cards.
     */
    @Override
    public void fillDeck() {

        //Must be called before adding cards to the deck.
        prepareDeckForReFill();

        for (FrenchSuit frenchSuit : FrenchSuit.values()) {

            for (Rank rank: Rank.values()) {

                addCardToDeck(new Card<FrenchSuit, Rank>(frenchSuit, rank));
            }
        }
    }

}//End of Class.
