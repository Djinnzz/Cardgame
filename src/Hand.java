/**
 * The hand class
 * contains a list of cards that are on the hand of a player
 * */

import java.util.ArrayList;

public class Hand {

    ArrayList<Card> handList = new ArrayList<>();

    public Hand(){



    }

    public void addToHand(Card card1){

        handList.add(card1);

    }

    public void removeFromHand(Card card1){

        handList.remove(card1);

    }

}
