import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        final boolean shouldFill = true;
        final boolean shouldWeightX = true;
        //Creates the frame to hold panel and text
        JFrame frame = new JFrame("STAY ON TASK");

        //JPanel to hold text and icons and buttons
        JPanel  p = new JPanel();

        JButton button;
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;
        }

        //Creates Button 1, filling the horizontal in cooperation with buttons 2 and 3
        button = new JButton("Button 1");
        if (shouldWeightX) {
            //Requests more space when window is resized
            c.weightx = 0.5;
        }
        c.fill = GridBagConstraints.HORIZONTAL;
        //Places Button 1 at the leftmost position of the grid
        c.gridx = 0;
        //Places button 1 at the topmost position of the grid
        c.gridy = 0;
        p.add(button, c);

        button = new JButton("Button 2");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        //Places Button 2 in the position to the right of Button 1 (gridx and gridy are 0-based)
        c.gridx = 1;
        c.gridy = 0;
        p.add(button, c);

        button = new JButton("Button 3");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 0.5;
        c.gridx = 2;
        c.gridy = 0;
        p.add(button, c);

        button = new JButton("Long-Named Button 4");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 40;      //make this component tall
        c.weightx = 0.0;
        c.gridwidth = 3;
        c.gridx = 0;
        c.gridy = 1;
        p.add(button, c);

        button = new JButton("5");
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipady = 0;       //reset to default height
        c.weighty = 1.0;   //request any extra vertical space
        c.anchor = GridBagConstraints.PAGE_END; //place at bottom of window
        c.insets = new Insets(10,0,0,0);  //top padding
        c.gridx = 1;       //aligned with button 2
        c.gridwidth = 2;   //2 columns wide
        c.gridy = 2;       //third row
        p.add(button, c);

        //creates label and adds it to the panel
        JLabel label1 = new JLabel("TEXT I ADDED TEXT TO THE SCREEN WOOOOOOOOOOOOO");
        c.gridx = 0;
        c.gridy = 2;
        p.add(label1, c);

        //adds panel to the frame and sets frame size
        frame.add(p);
        frame.setSize(1000,500);

        //makes frame visible
        frame.setVisible(true);
    }
}