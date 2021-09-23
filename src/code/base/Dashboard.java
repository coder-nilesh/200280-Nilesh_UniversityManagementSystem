package code.base;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Dashboard  implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JButton b1,b2,b3,b4,b5;
    Color success = new Color(116,181,112);
    Color warning = new Color(218,0,55);

    Dashboard(){
        f=new JFrame("University Management System - Dashboard");
        f.setBackground(Color.white);
        f.setResizable(false);
        f.setLayout(null);

        l1 = new JLabel();
        l1.setBounds(0,0,700,500);
        l1.setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("code/image/dash.png"));
        l1.setIcon(i1);
        f.add(l1);

        l2 = new JLabel("- STUDENT DETAILS -");
        l2.setBounds(220,80,270,40);
        l2.setFont(new Font("poppins",Font.BOLD,25));
        l2.setForeground(Color.black);
        l1.add(l2);

        b1=new JButton("Add");
        b1.setBounds(50,20,100,40);
        b1.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b1.addActionListener(this);
        l1.add(b1);


        b2=new JButton("View");
        b2.setBounds(410,20,100,40);
        b2.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b2.addActionListener(this);
        l1.add(b2);

        b3=new JButton("Remove");
        b3.setBounds(290,20,100,40);
        b3.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b3.addActionListener(this);
        l1.add(b3);

        b4=new JButton("Update");
        b4.setBounds(170,20,100,40);
        b4.setFont(new Font("poppins",Font.TYPE1_FONT,15));
        b4.addActionListener(this);
        l1.add(b4);
        
        b5=new JButton("LOGOUT");
        b5.setBounds(530,20,110,40);
        b5.setFont(new Font("poppins",Font.BOLD,15));
        b5.setForeground(Color.WHITE);
        b5.setBackground(warning);
        b5.addActionListener(this);
        l1.add(b5);

        f.setVisible(true);
        f.setSize(700,520);
        f.setLocation(410,170);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            f.setVisible(false);
            new Add_Student();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Student();
        }
        if(ae.getSource()==b3){
            f.setVisible(false);
            new Remove_Student();
        }
        if(ae.getSource()==b4){
            f.setVisible(false);
            new SearchStudent();
        }
        if(ae.getSource()==b5){
            f.setVisible(true);
            int confirmed = JOptionPane.showConfirmDialog(f, 
            "Are you sure you want to logout?", "Exit From Dashboard.",JOptionPane.YES_NO_OPTION);
            
            if (confirmed == JOptionPane.YES_OPTION) {
             f.dispose();
            }
        }
    }
    

    public static void main(String[ ] arg){
        Dashboard d = new Dashboard();
    }
}
