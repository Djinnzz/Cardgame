/**
 * Card: Shield Knight
 * ID: BASE007
 *
 * A small knight with a giant towershield
 * */

public class Card_BASE007_ShieldKnight extends Card_Creature{

    public Card_BASE007_ShieldKnight(){

        setName("Shield Knight");
        setID("BASE007");

        setAttack(0);
        setDefense(900);
        setCost(0);

        setElement(Element.gaia);
        setRace(Card_Creature.Race.human);
        setCreatureClass(CreatureClass.warrior);

        setType(Card_Creature.Type.effect);
        setEffectText("When this card gets attacked, it gains +200 defense until the attack ended.");



        setCreator("Djinnz");

    }

    @Override
    public void procDefense(){

        this.setAttack(this.getAttack()+200);

    }

    @Override
    public void procEndFight() {

        this.setAttack(this.getAttack()-200);

    }

}
