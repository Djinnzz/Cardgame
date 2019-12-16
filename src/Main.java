/**
 * Main class (testing purpose)
 * */

public abstract class Main {

    public static void main(String[] args) {

        Set_BASE base= new Set_BASE();

        base.printCardList();

        System.out.println("test attack: ");

        Card_BASE005_PatronOfTheGuild card1 = new Card_BASE005_PatronOfTheGuild();
        Card_BASE006_ApprenticeLapis card2 = new Card_BASE006_ApprenticeLapis();

        System.out.println(card1.attack(card2));

    }

}
