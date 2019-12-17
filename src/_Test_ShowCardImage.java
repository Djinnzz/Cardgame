import javax.swing.*;

public abstract class _Test_ShowCardImage {

    /**
     * testing mehtods (not for the game)
     * */

    public static void openCardImage(Card card){

        JFrame jFrame = new JFrame();
        ImageIcon imageIcon = new ImageIcon(String.valueOf(card.getImage()));
        JLabel jLabel = new JLabel(imageIcon);
        jFrame.add(jLabel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);

    }
}
