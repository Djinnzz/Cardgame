import java.io.File;
import java.util.ArrayList;

/**
 * Card class
 * contains ID and name of a card
 * */

public abstract class Card {

    /**
     * Card vars
     * */

    private String name;       // cardname
    private String ID;         // card ID

    private String effectText;

    private String creator;

    private ArrayList<Tags> tagList = new ArrayList();

    public enum Tags {
        AdventureGuild
    }

    /**
     * Card image
     * */

    private File image;

    /**
     * Constructor
     * */

    public Card(){

    }

    /**
     * print card super method
     * */

    public void printCard(){

    }


    /**
     * destroy card method
     * */

    public void destroyCard(Card card){

        if(card instanceof Card_Creature){



        }

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

    public void setImage(File image) {
        this.image = image;
    }

    public File getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addToTagList(Tags tag){
        tagList.add(tag);
    }

    public ArrayList getTagList() {
        return tagList;
    }


}
