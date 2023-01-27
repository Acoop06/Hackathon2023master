import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BoxClicked implements ActionListener{
    int count = 0;// store number of clicks
        public static void main(String args[]){
            BoxClicked Clicks = new BoxClicked();
        }
        BoxClicked(){
            JFrame frame = new JFrame();
            JButton button1 = new JButton("Button1");
            JButton button2 = new JButton("Button2");
            button1.addActionListener(this);

            frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
            frame.add(button1);
            frame.add(button2);
            frame.getRootPane().setDefaultButton(button1); // sets default button
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(450,450);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            count++;
            System.out.println("You have clicked the ACTIVE button " + count + " times");
        }
}
