/**
 * Spell-card class (superclass for all Spells)
 * contains all spell related information
 * */


public abstract class Card_Spell extends Card {

    /**
     * spell type
     * */

    public enum Type {
        field,
        quick,
        permanent,
        equipment
    }

    private Type type;

    /**
     * Phases
     * */

    /**
     * PreparePhase
     * First phase of a turn
     * */

    public void procPrepare(){

        // starts at the start of a turn

    }

    /**
     * Summoning Phase
     * */

        public void procSummon(){

        // starts when this got summoned

    }

    /**
     * Getter and Setter
     * */

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
