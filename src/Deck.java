/**
 * The deck class
 * Contains an Arraylist of all cards inside
 **/

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    /**
     * The list of cards in the deck
     * */

    private ArrayList<Card> deckList = new ArrayList<>();

    /**
     * Construktor
     * */

    public Deck(ArrayList<Card> Deck){

        if(Deck.size() >= 40 && Deck.size() <= 60){

            deckList.addAll(Deck);

        }

    }

    /**
     * Getter and setter
     * */

    public void addToDeck(Card card1){
        deckList.add(card1);
    }

    public void removeFromDeck(Card card1){
        deckList.remove(card1);
    }

    public void setDeckList(ArrayList<Card> deckList) {
        this.deckList = deckList;
    }

    public ArrayList<Card> getDeckList() {
        return deckList;
    }

    /**
     * Method to shuffle the deck
     * */

    public void shuffleDeck(){

        Collections.shuffle(deckList);

    }

    /**
     * check for cards in deck
     * */

    public boolean checkDeck(Card card1){

         if(deckList.contains(card1)){
             return true;
         }
         else{
             return false;
         }
    }

}
