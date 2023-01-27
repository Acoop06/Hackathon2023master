import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //Creates the frame to hold panel and text
        JFrame frame = new JFrame("STAY ON TASK");

        //JPanel to hold text and icons and buttons
        JPanel  p = new JPanel();

        //NAME OF GRID CONSTRAINTS IS C
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        //constrains button horizontal size
        c.fill = GridBagConstraints.HORIZONTAL;

        JButton startButton = new JButton("Start");
        c.ipady = 0;       //reset to default height
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //place at bottom of window
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 3;       //third row
        p.add(startButton, c);

        //creates label and adds it to the panel
        JLabel label1 = new JLabel("TEXT I ADDED TEXT TO THE SCREEN");
        //keeps field from centering and offputting the button
        c.weighty = 0;
        c.weightx = 0.5;
        c.gridx = 0;
        c.gridy = 0;
        p.add(label1, c);

        JTextField field1 = new JTextField();
        field1.setText("TESTING");
        c.weighty = 0;
        c.gridx = 2;
        c.gridy = 0;
        p.add(field1, c);

        //adds panel to the frame and sets frame size
        frame.add(p);
        frame.setSize(1000,500);

        //makes frame visible
        frame.setVisible(true);
    }

    public static void startTimer(){
        //Timer stuff here
    }
}