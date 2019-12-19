import javax.swing.*;

public abstract class _Test {

    /**
     * testing mehtods (not for the game)
     * */

    public static void testError(){

        /**
         * Tests Error message
         * */

        Error_MessageFrame.printMessage(0,"Test Error");
    }

    public static void testCardImage(){

        /**
         * Tests if image of card is set correct
         * */


        Card_BASE000_StrangeKnight card0 = new Card_BASE000_StrangeKnight();
        JFrame jFrame = new JFrame();
        ImageIcon imageIcon = new ImageIcon(String.valueOf(card0.getImage()));
        JLabel jLabel = new JLabel(imageIcon);
        jFrame.add(jLabel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);

    }

    public static void testAttack(){

        /**
         * Tests the attack function
         * */

        System.out.println("test attack: ");

        Card_BASE005_PatronOfTheGuild card1 = new Card_BASE005_PatronOfTheGuild();
        Card_BASE006_ApprenticeLapis card2 = new Card_BASE006_ApprenticeLapis();

        card1.attack(card2);

    }

    public static void testSetList(Set set){

        /**
         * Tests if the set is filled correctly
         * */

        set.printCardList();

    }

}
