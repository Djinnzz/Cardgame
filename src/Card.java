/**
 * Card class
 * contains ID and name of a card
 * */

public class Card {

    /**
     * Card vars
     * */

    private String name;       // cardname
    private String ID;         // card ID

    private String effectText;

    private String creator;

    /**
     * Constructor
     * */

    public Card(){

    }

    /**
     * Getter - Setter
     * */

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setEffectText(String effectText) {
        this.effectText = effectText;
    }

    public String getEffectText() {
        return effectText;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
