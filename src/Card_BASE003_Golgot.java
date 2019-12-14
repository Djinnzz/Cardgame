/**
 * Card: Golgot
 * ID: BASE003
 * */

public class Card_BASE003_Golgot extends Card_Creature {

    public Card_BASE003_Golgot(){

        setName("Golgot");
        setID("BASE003");

        setAttack(300);
        setDefense(300);
        setCost(0);

        setElement(Element.gaia);
        setRace(Race.human);
        setMonsterClass(MonsterClass.thief);

        setType(Type.effect);
        setEffectText("This card can attack your opponent directly.");

        setCreator("Djinnz");

    }
}
