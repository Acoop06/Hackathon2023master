import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextField extends JFrame {

    JPanel jp = new JPanel();
    JLabel jl = new JLabel();
    JTextField jt = new JTextField(30);
    JButton jb = new JButton("Enter");

    public TextField(){
        setTitle("Test");
        setVisible(true);
        setSize(400,200);

        jp.add(jt);

        jt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = jt.getText();
                jl.setText(input);
            }
        });

        jp.add(jb);
        jb.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                String input = jt.getText();
                jl.setText(input);
            }
        });

        jp.add(jl);
        add(jp);
    }

}
