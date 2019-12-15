/**
 *  Set Number 0 BASE set
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

        Card_BASE000_StrangeKnight card_base000_strangeKnight = new Card_BASE000_StrangeKnight();
        addToCardList(card_base000_strangeKnight);

        Card_BASE001_AdventureGuild card_base001_adventureGuild = new Card_BASE001_AdventureGuild();
        addToCardList(card_base001_adventureGuild);

        Card_BASE002_ShiningKnight card_base002_shiningKnight = new Card_BASE002_ShiningKnight();
        addToCardList(card_base002_shiningKnight);

        Card_BASE003_Golgot card_base003_golgot = new Card_BASE003_Golgot();
        addToCardList(card_base003_golgot);

        Card_BASE004_PoisonedDagger card_base004_poisonedDagger = new Card_BASE004_PoisonedDagger();
        addToCardList(card_base004_poisonedDagger);

        Card_BASE005_PatronOfTheGuild card_base005_patronOfTheGuild = new Card_BASE005_PatronOfTheGuild();
        addToCardList(card_base005_patronOfTheGuild);

        Card_BASE006_ApprenticeLapis card_base006_apprenticeLapis = new Card_BASE006_ApprenticeLapis();
        addToCardList(card_base006_apprenticeLapis);

    }

}
