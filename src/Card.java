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

    String creator;

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

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
