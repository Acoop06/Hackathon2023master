import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Creates the frame to hold panel and text
        JFrame frame = new JFrame("STAY ON TASK");

        //JPanel to hold text and icons and buttons
        JPanel  p = new JPanel();

        //creates label and adds it to the panel
        JLabel label1 = new JLabel("TEXT I ADDED TEXT TO THE SCREEN WOOOOOOOOOOOOO");
        p.add(label1);

        //adds panel to the frame and sets frame size
        frame.add(p);
        frame.setSize(500,500);

        //makes frame visible
        frame.setVisible(true);
    }
}