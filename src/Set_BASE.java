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

        Card_BASE002_ShiningKnight card_003 = new Card_BASE002_ShiningKnight();
        addToCardList(card_003);

        Card_BASE003_Golgot card_004 = new Card_BASE003_Golgot();
        addToCardList(card_004);

    }

}
