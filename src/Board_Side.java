public class Board_Side {

    /**
     * player stats
     * */

    int health;

    /**
     * Five creature slots
     * */

    Card_Creature creature1;
    Card_Creature creature2;
    Card_Creature creature3;
    Card_Creature creature4;
    Card_Creature creature5;

    /**
     * Five spell slots
     **/

    Card_Spell spell1;
    Card_Spell spell2;
    Card_Spell spell3;
    Card_Spell spell4;
    Card_Spell spell5;

    /**
     * One field spell slot
     * */

    Card_Spell spellField;

    /**
     * One deck slot
     * */

    Deck deck;

    /**
     * One graveyard slot
     * */

    Graveyard graveyard;

    /**
     * One extradeck slot
     * */

    Extradeck extradeck;

    /**
     * One hand
     * */

    Hand hand;

    public Board_Side(Deck deck1, Extradeck extradeck1){

        this.deck = deck1;
        this.extradeck = extradeck1;

    }

}
