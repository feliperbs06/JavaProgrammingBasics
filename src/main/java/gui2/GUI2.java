package gui2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class GUI2 {
    private JFrame theFrame;
    private JButton theButton;
    private JTextArea theText;

    public void go() {
        theFrame = new JFrame("GUI components");
        theFrame.setLayout(new GridLayout(2, 1));

        theButton = new JButton("Click me");
        theText = new JTextArea("edit this");

        theButton.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    theText.append("\nButton clicked at " + new Date());
                    System.out.println("Button was clicked!");
                }
            }
        );

        theFrame.add(theButton);
        theFrame.add(theText);

        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        theFrame.setBounds(10, 10, 300, 200);
        theFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI2().go();
    }
}
