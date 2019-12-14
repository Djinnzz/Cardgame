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
     * Card Races
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
     * Card Class
     * */

    public enum MonsterClass{
        warrior,
        thief,
        wizard,
        shaman,
        beast
    }

    private MonsterClass monsterClass;

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

    public void setMonsterClass(MonsterClass monsterClass) {
        this.monsterClass = monsterClass;
    }

    public MonsterClass getMonsterClass() {
        return monsterClass;
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
