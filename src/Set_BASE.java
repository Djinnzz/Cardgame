/**
 *
 * */

public class Set_BASE extends Set{

    public Set_BASE(){

        /**
         * setting set name
         * */

        setName("BASE");

        /**
         * adding cards to the list
         * */

        Card_BASE000_StrangeKnight card_000 = new Card_BASE000_StrangeKnight();
        addToCardList(card_000);
        Card_BASE001_AdventureGuild card_001 = new Card_BASE001_AdventureGuild();
        addToCardList(card_001);

    }

}
