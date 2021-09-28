package code.base;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SearchStudent implements ActionListener{
    JFrame f;
    JTextField t;
    JLabel l,l5;
    JButton b,b2;
    Color success = new Color(116,181,112);
    Color warning = new Color(218,0,55);

    SearchStudent(){
        f=new JFrame("University Management System - Search Students");
        f.setBackground(Color.green);
        f.setResizable(false);
        f.setLayout(null);

        l5=new JLabel();
        l5.setBounds(0,0,500,270);
        l5.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("code/image/searchData.png"));
        l5.setIcon(img);


        l=new JLabel("Student ID:");
        l.setVisible(true);
        l.setBounds(40,50,250,30);
        l.setForeground(Color.black);
        Font F1=new Font("serif",Font.BOLD,25);
        l.setFont(F1); 
        l5.add(l);
        f.add(l5);

        t=new JTextField();
        t.setBounds(240,50,220,30);
        l5.add(t);

        b=new JButton("SEARCH");
        b.setBackground(success);
        b.setForeground(Color.WHITE);
        b.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b.setBounds(200,150,130,40);
        b.addActionListener(this);
        l5.add(b);


        b2=new JButton("CANCEL");
        b2.setBounds(350,150,130,40);
        b2.setForeground(Color.WHITE);
        b2.setBackground(warning);
        b2.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b2.addActionListener(this);
        l5.add(b2);

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
            new UpdateStudent(t.getText());
            f.setVisible(false);
        }

    }
    
    public static void main(String[]ar){
        new SearchStudent();
    } 	
}