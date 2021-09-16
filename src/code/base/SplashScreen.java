package code.base;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class SplashScreen implements ActionListener{
    JFrame f; 
    JLabel id,l1;
    JButton b;
    Color maroon = new Color(130,49,48);

    SplashScreen(){
 
        
        f=new JFrame("University Management System -  Splash Screen");
        f.setResizable(false);
        f.setLayout(null);
       
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("code/image/splash.png"));
        Image i2 = i1.getImage().getScaledInstance(1200,700,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        
        l1.setBounds(0,150,1360,530);
        f.add(l1);


        b = new JButton("CLICK HERE TO CONTINUE");
        b.setBackground(maroon);
        b.setForeground(Color.WHITE);
        

        b.setBounds(460,700,500,70);
        b.addActionListener(this);

        id=new JLabel();
        id.setBounds(0,0,1360,800);
        id.setLayout(null);
        

        JLabel lid = new JLabel("UNIVERSITY MANAGEMENT SYSTEM");
        lid.setBounds(50,30,1500,100);
        lid.setFont(new Font("serif",Font.PLAIN,70));
        lid.setForeground(maroon);
        id.add(lid);

        id.add(b);
        f.add(id);
        
        
        f.getContentPane().setBackground(Color.WHITE);

        f.setVisible(true);
        f.setSize(1360,850);
        f.setLocation(100,5);


    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b){
            f.setVisible(false);
            new Login();
        }
    }

    public static void main(String[] arg){
        SplashScreen f = new SplashScreen();
    }
}