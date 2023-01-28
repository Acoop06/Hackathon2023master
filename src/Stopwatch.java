import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

public class Stopwatch {
    static int interval;
    static Timer timer;
    static String secs;

    public Stopwatch(String s) {
        //Takes a string and converts to seconds
        secs = s;
        int delay = 1000;
        int period = 1000;
        timer = new Timer(); //Creates the timer object
        interval = Integer.parseInt(secs); //length of timer
        System.out.println(secs);
        JFrame timerFrame = new JFrame("TIMER");
        JPanel timerPanel = new JPanel();
        timerPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                //Formatting window stuff
                /*timerFrame.setSize(1000,500);
                timerPanel.removeAll();
                JLabel header = new JLabel("Time Remaining:");
                c.gridx = 0;
                c.gridy = 0;
                timerPanel.add(header, c);
                //Updates timer text
                */
                /*
                c.gridx = 0;
                c.gridy = 1;
                timerPanel.add(time, c);
                timerFrame.setVisible(true);
                timerFrame.add(timerPanel);*/
            }
        }, delay, period);
    }

    public static int setInterval() {
        //Increments the timer
        if (interval == 1) {
            timer.cancel();
        }
        return --interval;
    }
}
