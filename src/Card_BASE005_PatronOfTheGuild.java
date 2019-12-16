/**
 * Card: Patron of the Guild
 * ID: BASE005
 *
 * The Patron of the adventure Guild
 * */

public class Card_BASE005_PatronOfTheGuild extends Card_Creature{

    public Card_BASE005_PatronOfTheGuild(){

        setName("Patron of the Guild");
        setID("BASE005");

        setAttack(1200);
        setDefense(1800);
        setCost(0);

        setElement(Element.light);
        setRace(Race.human);
        setCreatureClass(CreatureClass.warrior);

        setType(Type.effect);
        setEffectText("This card counts as \"Adventure-Guild\" card. While this card is on your side of the field, heal 200 health at the begin of your turn. This effect can be activated once per turn.");

        addToTagList(Tags.AdventureGuild);

        setCreator("Djinnz");

    }

    @Override
    public void procPrepare(){

        // player health +200
        // not finished coz player class is not implemented atm

    }

}
