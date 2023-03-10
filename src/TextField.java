import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class TextField extends JFrame {
//creates a panel
    JPanel jp = new JPanel();
    //creates a label
    JLabel jl = new JLabel();
    //creates labels for timestamps
    JLabel hourLabel = new JLabel("Hours:");
    JLabel minuteLabel = new JLabel("Minutes:");
    JLabel secondsLabel = new JLabel("Seconds:");
    JTextField jt = new JTextField("0",10);
    JTextField jtmin = new JTextField("0",10);
    JTextField jtsec = new JTextField("0",10);
    JButton jb = new JButton("Enter");
    JLabel message = new JLabel("What do you need to remind yourself to do?");
    static JTextField textInput = new JTextField("DO YOUR WORK",10);

    static Timer timer = new Timer();
    int seconds = 0;
    int minutes = 0;
    int hours = 0;
    static int interval = 0;
    static JCheckBox checkBox = new JCheckBox();

    public TextField(){
        setTitle("Remindinator");
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
        jp.add(message);
        jp.add(textInput);
        checkBox.setText("Toggle Flashing");
        checkBox.setFocusable(false);

        jp.add(checkBox);

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

                String totalTime = hours + minutes + seconds + "";

                interval = Integer.parseInt(totalTime);
                timer.scheduleAtFixedRate(new TimerTask() {
                    public void run() {
                        System.out.println(interval);
                        jl.setText("Timer Set! Time Remaining:  " + setInterval() + " seconds");
                    }
                }, 1000, 1000);


            }
        });

        //ands jlabel to jpanel
        jp.add(jl);
        add(jp);
    }
    public static int setInterval() {
        //Increments the timer
        if (interval <= 1) {
            PopUps pa = new PopUps();
            timer.cancel();
        }
        return --interval;
    }

}
