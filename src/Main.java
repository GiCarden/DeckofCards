import deck_package.FrenchDeck;

/**
 * These are classes, which can be extended to implement a specific playing card deck.
 *
 * Test class.
 */
public class Main {

    public static void main(String[] args) {

        FrenchDeck frenchDeck = new FrenchDeck();
        System.out.print(frenchDeck);
        frenchDeck.fillDeck();
        frenchDeck.shuffleDeck();
        System.out.print(frenchDeck);
        frenchDeck.dealCard();
        System.out.print(frenchDeck);
        frenchDeck.dealCards(2);
        System.out.print(frenchDeck);
    }
}

