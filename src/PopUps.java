import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class PopUps extends JFrame implements ActionListener {
    //sets up first pop up
    Popup pu;

    //sets up frame
    JFrame f;

    //sets up panel
    JPanel pa = new JPanel();

    //a popup fcactory
    PopupFactory pf;
    static Timer flashTimer = new Timer();
    static int flashInterval = 0;
    static int counter = 0;

    //constructor method
    PopUps() {
        //makes a frame
        f = new JFrame();
        //set frame size
        f.setSize(400, 400);
        //makes pop up factory
        pf = new PopupFactory();
        f.setResizable(false);
        //makes label
        //makes button (to check completion)
        JButton b = new JButton("Finished");
        JLabel userMessage = new JLabel(TextField.textInput.getText());

        //action listener for button
        b.addActionListener(this);

        //content shown on panel
        pa.add(userMessage, SwingConstants.CENTER);
        pa.add(b);
        pa.setLayout(new GridLayout(2, 1));

        //creates the pop up
        pu = pf.getPopup(f, pa, 180, 100);

        f.add(pa);
        f.show();
        if(TextField.checkBox.isSelected()) {
            flashTimer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    counter++;
                    if (counter % 2 == 0) {
                        pa.setBackground(Color.BLACK);
                        userMessage.setForeground(Color.WHITE);
                    } else {
                        pa.setBackground(Color.WHITE);
                        userMessage.setForeground(Color.BLACK);
                    }
                }
            }, 0, 5000);
        }
    }

    //method for completion button pressed
    public void actionPerformed(ActionEvent e){
        f.dispose();
    }
}

