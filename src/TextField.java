import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JLabel hourLabel = new JLabel("Hours:");
    JLabel minuteLabel = new JLabel("Minutes:");
    JLabel secondsLabel = new JLabel("Seconds:");
    JTextField jt = new JTextField("0",10);
    JTextField jtmin = new JTextField("0",10);
    JTextField jtsec = new JTextField("0",10);
    JButton jb = new JButton("Enter");
    int seconds = 0;
    int minutes = 0;
    int hours = 0;

    public TextField(){
        setTitle("Test");
        setVisible(true);
        setSize(550,400);
        setResizable(false);

        jp.add(hourLabel);
        jp.add(jt);
        jp.add(minuteLabel);
        jp.add(jtmin);
        jp.add(secondsLabel);
        jp.add(jtsec);

        jp.add(jb);
        jb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String inputSec = jtsec.getText();
                seconds = (Integer.parseInt(inputSec));

                String inputMin = jtmin.getText();
                minutes = (Integer.parseInt(inputMin))*60;

                String inputHr = jt.getText();
                hours = (Integer.parseInt(inputHr)*3600);

                jl.setText("Timer Set!");

                String totalTime = hours + minutes + seconds + "";

                Stopwatch timer = new Stopwatch(totalTime);
            }
        });

        //ands jlabel to jpanel
        jp.add(jl);
        add(jp);
    }

}
