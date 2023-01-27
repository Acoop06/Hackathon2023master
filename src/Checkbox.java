import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Checkbox extends JFrame implements ActionListener {

    Checkbox(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("works?");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.PLAIN, 20));

        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a){

    }

}
