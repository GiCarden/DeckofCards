package card_package;

/**
 * French card rank enum class.
 */
public enum Rank {

//Enum Variable list(s)-
    ACE(1, "Ace"), DEUCE(2, "Deuce"), THREE(3, "Three"), FOUR(4, "Four"), FIVE(5, "Five"), SIX(6, "Six"),
    SEVEN(7, "Seven"), EIGHT(8, "Eight"), NINE(9, "Nine"), TEN(10, "Ten"),
    JACK(11, "Jack"), QUEEN(12, "Queen"), KING (13, "King");

//Variable(s)-
    private int rankValue;
    private String rankString;

//Constructor(s)-
    Rank(int rankValue, String rankString) { this.rankValue = rankValue; this.rankString = rankString; }

//Public Overridden Method(s)-
    @Override
    public String toString() { return getRankString(); }

//Getters(s)-
    public int getRankValue() { return rankValue; }

    public String getRankString() { return rankString; }

}//End of enum.
