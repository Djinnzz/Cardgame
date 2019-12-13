/**
 * Card class
 * contains all information that a Card has
 * */

public class Card {

    /**
     * Card vars
     * */

    String name;       // cardname

    int attack;        // card attack stat
    int defense;       // card defense stat
    int cost;          // cost of a card

    /**
     * Card types
     * */

    public enum type {
        light,
        darkness,
        pyro,
        aqua,
        aero,
        gaia
    }

    Card.type type;

    /**
     * Card races
     * */

    public enum race {
        human,
        dwarf,
        elf,
    }

    Card.race race;

    /**
     * Constructor
     * */

    public Card(String _name, int _attack, int _defense, int _cost, type _type, race _race){

        /*
        * setting the vars with respective setters
        * */

        setName(_name);
        setAttack(_attack);
        setCost(_cost);
        setDefense(_defense);
        setRace(_race);
        setType(_type);

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

    public int getDefense() {
        return defense;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRace(Card.race race) {
        this.race = race;
    }

    public Card.race getRace() {
        return race;
    }

    public void setType(Card.type type) {
        this.type = type;
    }

    public Card.type getType() {
        return type;
    }
}
