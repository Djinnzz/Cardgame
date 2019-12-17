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

    @Override
    public void printCard(){

        System.out.println("ID:             "+this.getID());
        System.out.println("Name:           "+this.getName());
        System.out.println("Creator:        "+this.getCreator());

        System.out.println("Type:           "+this.getType());
        System.out.println("Effect:         "+this.getEffectText());

        // printing card tags
        if(this.getTagList().size() != 0){
            System.out.print("Tags:           ");
            for(int c = 0; c < this.getTagList().size(); c++){
                System.out.print(this.getTagList().get(c));
            }
            System.out.println("");
        }

    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
