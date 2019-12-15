/**
 * Card: Adventure Guild
 * ID: BASE001
 *
 * The home of Adventures. A big cozy tavern.
 * */

public class Card_BASE001_AdventureGuild extends Card_Spell {

    public Card_BASE001_AdventureGuild(){

        setName("Adventure Guild");
        setID("BASE001");

        setType(Type.field);
        setEffectText("When this card is activated, place 1 \"Adventure\" counter on it. All warriors, wizards and thiefs on the board get +50 attack per \"Adventure\" counter on this card.");

        setCreator("Djinnz");

    }
}
