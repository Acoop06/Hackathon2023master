import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Creates the frame
        JFrame frame = new JFrame("[App Name Here]");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}