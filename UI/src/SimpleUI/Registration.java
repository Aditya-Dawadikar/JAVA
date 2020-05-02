package SimpleUI;

        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class Registration implements ActionListener {

    JFrame frame;
    JPanel panel;
    JTextField username;
    JPasswordField password,confirm;
    JLabel user,pass,cpass;
    JButton button;

    Registration(){
        frame=new JFrame("Registration Window");
        panel=new JPanel();
        username=new JTextField(10);
        password=new JPasswordField(10);
        confirm=new JPasswordField(10);
        user=new JLabel("Username: ");
        pass=new JLabel("Password: ");
        cpass=new JLabel("Confirm Password: ");
        button=new JButton("Register");
        button.addActionListener(this);
        panel.add(user);
        panel.add(username);
        panel.add(pass);
        panel.add(password);
        panel.add(cpass);
        panel.add(confirm);
        panel.add(button);
        frame.add(panel);
        frame.setSize(250,250);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Registration();
    }

    @Override
    public void actionPerformed(ActionEvent obj) {
        // TODO Auto-generated method stub
        if(password.getPassword().equals(confirm.getPassword())){
            frame.dispose();
            new Final();
        }else{
            System.out.println("password and confirmed password does not match");
        }

    }

}
