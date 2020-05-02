import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Demo2 implements ActionListener {

    /*
     * String usrname=tuser.getText;
     * String pass=
     * code for connectivity
     * while(rs.next)
     * {
     * if(username.equals(rs.getString("username")){
     * 	if(passowrd.equals(rs.getString(2)){
     * 		Joptionpane.showMessageDialog
     * 	else
     * 		password wrong
     * else
     * 	username wrong
     */
    JFrame frame;
    //stage 1- symtoms
    //stage 2- blood test report - blood group,hglobin,white parasites count,antibodies vount
    //stage 3- t genen,g,N
    JPanel panel;
    JTextField tuser;
    JLabel luser,lpass,lcourse,lcity,lgender;
    JPasswordField ppass;
    JButton blogin,bclear;
    JCheckBox c,cpp,java;
    JRadioButton male,female;
    JComboBox city;

    Demo2(){
        String arr[]={"Pune","Mumbai"};
        frame=new JFrame("Sign Up window");
        panel=new JPanel();
        tuser=new JTextField(10);
        luser=new JLabel("Username: ");
        lpass=new JLabel("Password:");
        lcourse=new JLabel("Course: ");
        lgender=new JLabel("Gender: ");
        lcity=new JLabel("City: ");
        ppass=new JPasswordField(10);
        blogin=new JButton("Sign Up");
        bclear=new JButton("Clear");
        c=new JCheckBox("C");
        cpp=new JCheckBox("C++");
        java=new JCheckBox("Java");
        male=new JRadioButton("Male");
        female=new JRadioButton("feamle");
        ButtonGroup bg=new ButtonGroup();
        bg.add(male);
        bg.add(female);
        city=new JComboBox(arr);
        blogin.addActionListener(this);
        bclear.addActionListener(this); //Use anonymous inner class
        panel.add(luser);
        panel.add(tuser);
        panel.add(lpass);
        panel.add(ppass);
        panel.add(lcourse);
        panel.add(c);
        panel.add(cpp);
        panel.add(java);
        panel.add(lgender);
        panel.add(male);
        panel.add(female);
        panel.add(lcity);
        panel.add(city);
        panel.add(blogin);
        panel.add(bclear);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(250,250);
        // Inner Member Class-
        // Inner Local Class
        // Inner anonymous class
        // Inner static member class
    }

    public static void main(String[] args) {
        new Demo2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource()==bclear){
            tuser.setText("");
            ppass.setText("");
        }
        String username=null,password=null,course=null,city_selected=null,gender=null;
        if(e.getSource()==blogin){
            username=tuser.getText();
            password=ppass.getText();
        }
        if(c.isSelected())
            course="C";
        if(cpp.isSelected())
            course="C++";
        if(java.isSelected())
            course="JAVA";
        if(male.isSelected())
            gender="male";
        if(female.isSelected())
            gender="female";
        city_selected=(String) city.getItemAt(city.getSelectedIndex());

        System.out.println(username+" "+password+" "+course+" "+gender+" "+city_selected);
        //DB connection
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }
        try {
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chandler","chandler");
            PreparedStatement pr=con.prepareStatement("insert into visionware values(?,?,?,?,?)");
            pr.setString(1, username);
            pr.setString(2, password);
            pr.setString(3,course);
            pr.setString(4, gender);
            pr.setString(5, city_selected);
            pr.execute();
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
        int a= JOptionPane.showConfirmDialog(frame, "Do you want to proceed");
        if(a==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(frame, "Hurray...Sign Up succesful");
            frame.dispose();
            new Window1();
        }
    }
}