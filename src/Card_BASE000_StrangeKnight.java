/**
 * Card: Strange Knight
 * ID: BASE000
 *
 * An unknown strange looking knight.
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
        setCreatureClass(CreatureClass.warrior);

        setType(Type.effect);
        setEffectText("When this card is summoned, you can search one \"Adventure-Guild\" card in your deck and take it to your hand. Shuffle your deck afterwards.");

        setCreator("Djinnz");

    }

}
