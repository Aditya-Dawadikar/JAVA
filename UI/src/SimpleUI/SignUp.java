package SimpleUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp implements ActionListener {

    JFrame frame;
    JPanel panel;
    JButton button;

    SignUp() {
        frame = new JFrame("Login Window");
        panel = new JPanel();
        button = new JButton("SignUp");
        button.addActionListener(this);

        panel.add(button);
        frame.add(panel);
        frame.setSize(250, 250);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new SignUp();
    }

    @Override
    public void actionPerformed(ActionEvent obj) {
        // TODO Auto-generated method stub
        frame.dispose();
        new Final();
    }
}