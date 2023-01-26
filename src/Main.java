import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Creates the frame
        JFrame frame = new JFrame("STAY ON TASK");

        //JPanel
        JPanel  p = new JPanel();

        //creates label
        JLabel label1 = new JLabel("TEXT I ADDED TEXT TO THE SCREEN WOOOOOOOOOOOOO");

        p.add(label1);

        frame.add(p);

        frame.setSize(500,500);

        frame.setVisible(true);
    }
}