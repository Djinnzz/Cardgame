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

    public enum CreatureClass {
        warrior,
        thief,
        wizard,
        shaman,
        beast
    }

    private CreatureClass creatureClass;

    /**
     * Constructor
     * */

    public Card_Creature(){

    }

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
     * Battlephase
     * Second phase of a turn
     **/

    /**
     * Start of the fight procs
    */

    public void procDefense(){

        // starts at the start of the fight
        // triggers individual card effects that proc when they get attacked

    }

    public void procAttack(){

        // starts at the start of a fight
        // triggers individual card effects that proc when they attack

    }

    /**
     * The fight itself
     * */

    public boolean attack(Card_Creature card2){

        // attacking method (starts when 1 creature attacks another)

        System.out.println(this.getName()+" attacks "+card2.getName()+"!");

        if(this.getAttack()  > card2.getDefense()){

            return true;
        }

        else /* (card1.getAttack() <= card2.getDefense()) */ {

            return false;

        }

    }

    /**
     * Afterfight procs
     * */

    public void procEndFight(){

        // should remove temporal effects that where added by procDefense or procAttack

    }

    /**
     * print card method
     * */

    @Override
    public void printCard(){

        System.out.println("ID:             "+this.getID());
        System.out.println("Name:           "+this.getName());
        System.out.println("Creator:        "+this.getCreator());

        System.out.println("Attack:         "+this.getAttack());
        System.out.println("Defense:        "+this.getDefense());

        System.out.println("Element:        "+this.getElement());
        System.out.println("Race:           "+this.getRace());
        System.out.println("Creatureclass:  "+this.getCreatureClass());

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

    public void setCreatureClass(CreatureClass creatureClass) {
        this.creatureClass = creatureClass;
    }

    public CreatureClass getCreatureClass() {
        return creatureClass;
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
