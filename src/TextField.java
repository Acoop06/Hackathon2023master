import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JTextField jt = new JTextField(30);
    JTextField jtmin = new JTextField(30);
    JTextField jtsec = new JTextField(30);
    JButton jb = new JButton("Enter");
    int seconds = 0;
    int minutes = 0;
    int hours = 0;

    public TextField(){
        setTitle("Test");
        setVisible(true);
        setSize(350,400);

        jp.add(jt);
        jp.add(jtmin);
        jp.add(jtsec);

        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                if (input != null && input.matches("[0-9.]+")) {
                    hours = (Integer.parseInt(input))*3600;
                    System.out.println("It worked :)))");
                }
            }
        });

        jtmin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                if (input != null && input.matches("[0-9.]+")) {
                    minutes = (Integer.parseInt(input))*60;
                    System.out.println("It worked :)))");
                }
            }
        });

        jtsec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                if (input != null && input.matches("[0-9.]+")) {
                    seconds = (Integer.parseInt(input));
                    System.out.println("It worked :)))");
                }
            }
        });

        jp.add(jb);
        jb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String input = jt.getText();
                jl.setText(String.valueOf(hours + minutes + seconds));
            }
        });

        //ands jlabel to jpanel
        jp.add(jl);
        add(jp);
    }

}
