package deck_package;

import card_package.*;

import java.util.Collections;
import java.util.Stack;

/**
 * Abstract Deck Class.
 */
abstract class Deck {

//Variable(s)-
    private Stack<Card> cards;

//Constructor(s)-
    /**
     * Creates an empty Stack.
     */
    Deck() { cards = new Stack<>(); }

//Private Method(s)-
    /**
     * Returns the number of cards in the Stack.
     *
     * @return size of the stack.
     */
    private int deckSize() { return cards.size(); }

    /**
     * Returns 'true' if the deck contains no cards, returns 'false' otherwise.
     *
     * @return true is deck empty else false.
     */
    private boolean deckEmpty() { return cards.isEmpty(); }

    /**
     * Clears the deck of all cards.
     */
    private void clearDeck() { cards.clear(); }

    /**
     * Checks if it is  possible to remove "n" number cards from the deck, otherwise does nothing.
     *
     * @param amount of cards to remove.
     * @return true if can remove "n" number of cards else false.
     */
    private boolean ableToRemove(int amount) { return amount <= cards.size(); }

//Package Private Method(s)-
    /**
     * This method should be called before re-filling the deck.
     */
    void prepareDeckForReFill() { if (!deckEmpty()) { clearDeck(); } }

    /**
     * Adds a card to the top of the deck.
     *
     * @param card to add to top of deck.
     */
    void addCardToDeck(Card card) { cards.push(card); }

//Public Method(s)-
    /**
     * Removes the card currently at the top of the deck.
     */
    public void dealCard() {

        if (deckEmpty()) { return; }

        //Removes the object at the top of this stack and returns that object as the value of this function.
        System.out.print(cards.pop());
    }

    /**
     * Removes the requested amount of cards from the top of the deck.
     *
     * @param amount of cards to remove.
     */
    public void dealCards(int amount) {

        if (deckEmpty() || !(ableToRemove(amount))) { return; }

        //Removes the object at the top of this stack and returns that object as the value of this function.
        for (int i = 0; i < amount; i++) { System.out.print(cards.pop()); }
    }

    /**
     * Randomly shuffles the cards in the deck in place.
     */
    public void shuffleDeck() { Collections.shuffle(cards); }

//Public Abstract Method(s)-
    /**
     * Abstract method to fill the deck, Extending class would implement this method.
     */
    public abstract void fillDeck();

//Public Overridden Method(s)-
    /**
     * toString overridden method.
     *
     * @return the current state of the deck.
     */
    @Override
    public String toString() {

        return String.format("\nIs Deck Empty: %s \nNumber of Cards in Deck: %s\n", deckEmpty(), deckSize());
    }

}//End of Class.
