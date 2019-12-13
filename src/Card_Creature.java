import java.lang.reflect.Type;

/**
 * Creature-card class (superclass for all Creatures)
 * contains all creature related information
 * */

public class Card_Creature extends Card{

    /**
     * Card vars
     * */

    private int attack;        // card attack stat
    private int defense;       // card defense stat
    private int cost;          // cost of a card

    String effectText;

    /**
     * Card Elements
     * */

    public enum Element {
        light,
        darkness,
        pyro,
        aqua,
        aero,
        gaia
    }

    private Element element;

    /**
     * Card races
     * */

    public enum Race {
        human,
        dwarf,
        elf,
    }

    private Race race;

    /**
     * Card Types
     * */

    public enum Type {
        basic,
        effect
    }

    private Type type;

    /**
     * Constructor
     * */

    public Card_Creature(){

    }

    /**
     * Getter - Setter
     * */


    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttack() {
        return attack;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setEffectText(String effectText) {
        this.effectText = effectText;
    }

    public String getEffectText() {
        return effectText;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Element getElement() {
        return element;
    }

    public int getDefense() {
        return defense;
    }

    public void setRace(Card_Creature.Race race) {
        this.race = race;
    }

    public Card_Creature.Race getRace() {
        return race;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }
}
