package code.base;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class View_Student implements ActionListener{

    JFrame f;
    JTextField t;
    JLabel l1,l2;
    JButton b,b2;
    
    Color success = new Color(116,181,112);
    Color warning = new Color(218,0,55);

    View_Student(){
        f=new JFrame("Employee Management System - Search Employee Data");
        f.setBackground(Color.green);
        f.setResizable(false);
        f.setLayout(null);

        l1=new JLabel();
        l1.setBounds(0,0,500,270);
        l1.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("code/image/searchData.png"));
        l1.setIcon(img);


        l2=new JLabel("Student ID:");
        l2.setVisible(true);
        l2.setBounds(40,60,250,30);
        l2.setForeground(Color.black);
        Font F1 = new Font("serif",Font.BOLD,30);
        l2.setFont(F1); 
        l1.add(l2);
        f.add(l1);


        t=new JTextField();
        t.setBounds(240,60,220,30);
        l1.add(t);

        b=new JButton("SEARCH");
        b.setForeground(Color.WHITE);
        b.setBackground(success);
        b.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b.setBounds(200,150,130,40);
        b.addActionListener(this);
        l1.add(b);

        b2=new JButton("CANCEL");
        b2.setForeground(Color.WHITE);
        b2.setBackground(warning);
        b2.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b2.setBounds(350,150,130,40);
        b2.addActionListener(this);
        l1.add(b2);

        f.setSize(500,270);
        f.setLocation(450,250);
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b2){
            f.setVisible(false);
            Dashboard d=new Dashboard();
        }
        if(ae.getSource()==b){
            f.setVisible(false);
            ViewDetails p=new ViewDetails(t.getText());
        }

    }

    public static void main(String[]ar){
        View_Student v=new View_Student();
    }
}