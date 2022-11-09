package BlackJack;

import BlackJackBase.PCard;

public class BJCard extends PCard {
    int rank;
    int suit;
    boolean hidden;

    final public int ACE = 1;
    final public int TWO = 2;
    final public int THREE = 3;
    final public int FOUR = 4;
    final public int FIVE = 5;
    final public int SIX = 6;
    final public int SEVEN = 7;
    final public int EIGHT = 8;
    final public int NINE = 9;
    final public int TEN = 10;
    final public int KNIGHT = 11;
    final public int JACK = 12;
    final public int QUEEN = 13;
    final public int KING = 14;

    final public int SPADES = 1;
    final public int HEART = 2;
    final public int DIAMOND = 3;
    final public int CLUB = 4;

    public BJCard (int rank, int suit){
        this.rank=rank;
        this.suit=suit;
    }

    //GETTERS AND SETTERS
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }






    //ABSTRACTS METHODS
    public void hideCard() {

    }


    public void showCard() {

    }


    public boolean isHidden() {
        return false;
    }

    public String getText() {
        return null;
    }
}
