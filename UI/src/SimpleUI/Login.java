package SimpleUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener{

    JFrame frame;
    JPanel panel;
    JTextField username;
    JPasswordField password;
    JLabel user,pass;
    JButton button1,button2;

    Login(){
        frame=new JFrame("Login Window");
        panel=new JPanel();
        username=new JTextField(10);
        password=new JPasswordField(10);
        user=new JLabel("Username: ");
        pass=new JLabel("Password: ");
        button1=new JButton("Login");
        button1.addActionListener(this);
        button2=new JButton("Register");
        button2.addActionListener(this);

        panel.add(user);
        panel.add(username);
        panel.add(pass);
        panel.add(password);
        panel.add(button1);
        panel.add(button2);
        frame.add(panel);
        frame.setSize(250,250);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent obj) {
        // TODO Auto-generated method stub
        if(obj.getSource()==button1){
            if(username.getText().equals("xyz")){
                if(password.getText().equals("xyz")){
                    System.out.println("User authorised");
                    frame.dispose();
                    new SignUp();
                }
                else{
                    System.out.println("password is wrongs");
                }
            }
            else
                System.out.println("Username is wrong");
        }else{
                    frame.dispose();
                    new Registration();
        }
    }

}
