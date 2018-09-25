package card_package;

/**
 * French card suit enum class.
 */
public enum FrenchSuit {

//Enum Variable list(s)-
    DIAMONDS("Diamonds"), CLUBS("Clubs"), HEARTS("Hearts"), SPADES ("Spades");

//Variable(s)-
    private String suitString;
    private int suitValue;

//Constructor(s)-
    FrenchSuit(String suitString) { this.suitString = suitString; }

    FrenchSuit(String suitString, int suitValue) { this.suitString = suitString; this.suitValue = suitValue; }

//Public Overridden Method(s)-
    @Override
    public String toString() { return getSuitString(); }

//Getters(s)-
    public String getSuitString() { return suitString; }

    public int getSuitValue() { return suitValue; }

}//End of enum.
