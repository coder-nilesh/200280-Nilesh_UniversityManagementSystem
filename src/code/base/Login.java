package code.base;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Login implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2,b3;
    
    Color green = new Color(116,181,112);
    Color red = new Color(218,0,55);


    Login(){

        f=new JFrame("University Management System - Login Page");
        f.setResizable(false);
        f.setBackground(Color.BLACK);
        f.setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(550,100,100,30);
        l1.setFont(new Font("arial",Font.TYPE1_FONT,15));
        f.add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(550,190,100,30);
        l2.setFont(new Font("arial",Font.TYPE1_FONT,15));
        f.add(l2);
 
        t1=new JTextField();
        t1.setBounds(650,100,250,40);
        f.add(t1);

        t2=new JPasswordField();
        t2.setBounds(650,190,250,40);
        f.add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("code/image/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(30,30,500,500);
        f.add(l3);


        b1 = new JButton("LOGIN");
        b1.setBounds(620,280,130,40);
        b1.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b1.addActionListener(this);
        b1.setBackground(green);
        b1.setForeground(Color.WHITE);
        f.add(b1);

        b2=new JButton("CLOSE");
        b2.setBounds(800,280,130,40);
        b2.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b2.setBackground(red);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        f.add(b2);
        
        
        
        b3=new JButton("SIGN UP");
        b3.setBounds(620,350,315,40);
        b3.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        f.add(b3);
        
        
        
        f.getContentPane();
        f.setVisible(true);
        f.setSize(1000,600);
        f.setLocation(200,100);

    }

    public void actionPerformed(ActionEvent ae){

        
            
        try{
            conn c1 = new conn();
            String u = t1.getText();
            String v = t2.getText();
            
            String q = "select * from login where username='"+ u +"' and password='"+ v +"'";
            
            ResultSet rs = c1.s.executeQuery(q);
            
            if(rs.next()){
                new Dashboard().f.setVisible(true);
                f.setVisible(false);
                
            }else if(ae.getSource()==b3){
                f.setVisible(false);
                new Register();
            
            }
            else if(ae.getSource()==b2){
                f.dispose();
                
            }
            else{
                JOptionPane.showMessageDialog(f, "Invalid Login");
                f.setVisible(false);
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
    
    
    
    public static void main(String[] arg){
        Login l=new Login();
    }
}