/**
 * Class opens a Frame that shows a message
 * */

import javax.swing.*;


public abstract class Error_MessageFrame {

    public static void printMessage(int errorNumber, String message){

        JFrame jFrame = new JFrame();

        jFrame.setTitle("An Error occurred: " +errorNumber);
        jFrame.setSize(300,200);

        JTextField text = new JTextField(message);
        text.setSize(300,200);
        text.setEditable(false);

        jFrame.add(text);
        jFrame.setVisible(true);

    }

}
