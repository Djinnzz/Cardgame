/**
 * Graveyard class
 * contains a list off all dead cards of a board
 * */

import java.util.ArrayList;

public class Graveyard {

    ArrayList<Card> graveyardList = new ArrayList<>();

    public Graveyard(){



    }

    public void addToGraveyard(Card card){

        graveyardList.add(card);

    }

    public void takeFromGraveyard(){

        // not yet implemented

    }

}
