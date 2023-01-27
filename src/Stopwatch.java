import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.Timer;

public class Stopwatch {
    static int interval;
    static Timer timer;

    public static void main(String[] args) {
        String secs = "10";
        int delay = 1000;
        int period = 1000;
        timer = new Timer();
        interval = Integer.parseInt(secs); //length of timer
        System.out.println(secs);
        JFrame timerFrame = new JFrame("TIMER");
        JPanel timerPanel = new JPanel();
        timerPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                JLabel header = new JLabel("Time Remaining:");
                c.gridx = 0;
                c.gridy = 0;
                timerPanel.add(header, c);
                JLabel time = new JLabel(Integer.toString(interval));
                c.gridx = 0;
                c.gridy = 1;
                timerPanel.add(time, c);
                timerFrame.setVisible(true);
                timerFrame.add(timerPanel);
            }
        }, delay, period);
    }

    private static int setInterval() {
        if (interval == 1)
            timer.cancel();
        return --interval;
    }
}
