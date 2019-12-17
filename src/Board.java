/**
 * The Board class
 * consists of 2 Board sides with one deck and one extradeck each
 * */

public class Board {

    Board_Side side1;
    Board_Side side2;

    public Board(Deck deck1, Extradeck extradeck1, Deck deck2, Extradeck extradeck2){

        side1 = new Board_Side(deck1, extradeck1);
        side2 = new Board_Side(deck2, extradeck2);

    }

    /*
    * Phases
    * */

    /**
     * Prepare phase
     * */

    public void preparePhase1(){

        side1.creature1.procPrepare();
        side1.creature2.procPrepare();
        side1.creature3.procPrepare();
        side1.creature4.procPrepare();
        side1.creature5.procPrepare();

        side1.spell1.procPrepare();
        side1.spell2.procPrepare();
        side1.spell3.procPrepare();
        side1.spell4.procPrepare();
        side1.spell5.procPrepare();

        side1.spellField.procPrepare();

    }

    public void preparePhase2(){

        side2.creature1.procPrepare();
        side2.creature2.procPrepare();
        side2.creature3.procPrepare();
        side2.creature4.procPrepare();
        side2.creature5.procPrepare();

        side2.spell1.procPrepare();
        side2.spell2.procPrepare();
        side2.spell3.procPrepare();
        side2.spell4.procPrepare();
        side2.spell5.procPrepare();

        side2.spellField.procPrepare();

    }

    /**
     * Summon phase
     * */

    public void summonPhase1(){

    }

    public void summonPhase2(){

    }

    /**
     * Battle phase
     * */

    public void battlePhase1(){

    }

    public void battlePhase2(){

    }

    /**
     * End phase
     * */

    public void turnEnd1(){

    }

    public void turnEnd2(){

    }



}
