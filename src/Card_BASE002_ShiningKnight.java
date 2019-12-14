/**
 * Card: Shining Knight
 * ID: BASE002
 * */

public class Card_BASE002_ShiningKnight extends Card_Creature{

    public Card_BASE002_ShiningKnight(){

        setName("Shining Knight");
        setID("BASE002");

        setAttack(300);
        setDefense(900);
        setCost(0);

        setElement(Element.gaia);
        setRace(Race.human);
        setMonsterClass(MonsterClass.warrior);

        setType(Type.effect);
        setEffectText("As long as this card is on your side of the field, \"AdventureGuild\" cant be destroyed");

        setCreator("Djinnz");

    }
}
