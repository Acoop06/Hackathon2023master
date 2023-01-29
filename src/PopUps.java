import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class PopUps extends JFrame implements ActionListener {
    //sets up first pop up
    Popup pu;

    //sets up frame
    JFrame f;

    //sets up panel
    JPanel pa;

    //a popup fcactory
    PopupFactory pf;

    //constructor method
    PopUps() {
        //makes a frame
        f = new JFrame();
        //set frame size
        f.setSize(400, 400);
        //makes pop up factory
        pf = new PopupFactory();
        //makes label
        JLabel lb = new JLabel("DO YOUR WORK");
        //makes button (to check completion)
        JButton b = new JButton("Finished");

        //action listener for button
        b.addActionListener(this);

        try {
            //sets window up
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
        }

        //creates a panel and sets the color
        pa = new JPanel();
        pa.setBackground(Color.WHITE);

        //font
        Font font = new Font("BOLD", 1, 14);

        lb.setFont(font);

        //content shown on panel
        pa.add(lb);
        pa.add(b);
        pa.setLayout(new GridLayout(2, 1));

        //creates the pop up
        pu = pf.getPopup(f, pa, 180, 100);

        //create a button
        JButton b2 = new JButton("click");

        //add action listener
        b2.addActionListener(this);

        //create panel
        JPanel pa2 = new JPanel();

        pa2.add(b2);
        f.add(pa2);
        f.show();
    }

    //method for completion button pressed
    public void actionPerformed(ActionEvent e){
        String d = e.getActionCommand();

        //if button is pressed stop pop up
        if (d.equals("Finished")){
            pu.hide();

            //create pop up
            pu = pf.getPopup(f, pa, 180, 100);
        }else
            pu.show();

    }

    //main
    public static void main(String args[]){

            PopUps pa = new PopUps();


    }
}

