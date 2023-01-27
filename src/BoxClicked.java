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
            button1.addActionListener(this);

            frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
            frame.add(button1);
            frame.getRootPane().setDefaultButton(button1); // sets default button
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(450,450);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        }

        public void actionPerformed(ActionEvent e) {
            //this is where the buttons are executed
            count++;
            System.out.print("There are this many " + count);
        }
}
