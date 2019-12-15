/**
 * Card: Apprentice Lapis
 * ID: BASE006
 *
 * An apprentice of the magical forces.
 * */

public class Card_BASE006_ApprenticeLapis extends Card_Creature{

    public Card_BASE006_ApprenticeLapis(){

        setName("Apprentice Lapis");
        setID("BASE006");

        setAttack(400);
        setDefense(200);
        setCost(0);

        setElement(Element.aqua);
        setRace(Race.human);
        setCreatureClass(CreatureClass.wizard);

        setType(Type.effect);
        setEffectText("When your opponent activates a spell, you can destroy this creature to negate its effect and destroy it.");

        setCreator("Djinnz");
    }
}
