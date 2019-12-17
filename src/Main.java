/**
 * Main class (testing purpose)
 * */

public abstract class Main {

    public static void main(String[] args) {

        /**
         * Tests if the set is filled correctly
         * */

        Set_BASE base= new Set_BASE();

        base.printCardList();

        /**
         * Tests the attack function
         * */

        System.out.println("test attack: ");

        Card_BASE005_PatronOfTheGuild card1 = new Card_BASE005_PatronOfTheGuild();
        Card_BASE006_ApprenticeLapis card2 = new Card_BASE006_ApprenticeLapis();

        card1.attack(card2);

        /**
         * Tests if image of card is set correct
         * */

        Card_BASE000_StrangeKnight card0 = new Card_BASE000_StrangeKnight();

        _Test_ShowCardImage.openCardImage(card0);

    }

}
