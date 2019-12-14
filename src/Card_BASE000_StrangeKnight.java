/**
 * Card: Strange Knight
 * ID: BASE000
 * */

public class Card_BASE000_StrangeKnight extends Card_Creature{

    public Card_BASE000_StrangeKnight(){

        setName("Strange Knight");
        setID("BASE000");

        setAttack(800);
        setDefense(400);
        setCost(0);

        setElement(Element.gaia);
        setRace(Race.human);
        setMonsterClass(MonsterClass.warrior);

        setType(Type.effect);
        setEffectText("When this card is summoned, you can search one \"Adventures-Guild\" card in your deck and take it to your hand. Shuffle your deck afterwards.");

        setCreator("Djinnz");

    }

}
