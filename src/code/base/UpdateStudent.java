package code.base;

import java.awt.*;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class UpdateStudent extends Add_Student implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11;
    JButton b,b1,b2,b3; 
    String student_id;
    
    Color green = new Color(116,181,112);
    Color red = new Color(218,0,55);

    UpdateStudent(String idaa){
        super(0);
        f=new JFrame("University Management System - Update Student Details");
        f.setVisible(true);
        f.setResizable(false);
        f.setSize(900,500);
        f.setLocation(450,250);
        f.setBackground(Color.white);
        f.setLayout(null);

        student_id =idaa;
        id15=new JLabel();
        id15.setBounds(0,0,900,500);
        id15.setLayout(null);


        id8 = new JLabel("Update Student Details:");
        id8.setBounds(215,10,600,50);
        id8.setFont(new Font("arial",Font.BOLD,40));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);


        id1 = new JLabel("Name:");  
        id1.setBounds(50,100,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,100,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name:");
        id2.setBounds(400,100,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,100,150,30);
        id15.add(t2);

        id3= new JLabel("Age:");
        id3.setBounds(50,150,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,150,150,30);
        id15.add(t3);

        id4= new JLabel("DOB(dd/mm/yy):");
        id4.setBounds(400,150,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,150,150,30);   
        id15.add(t4);

        id5= new JLabel("Address:");
        id5.setBounds(50,200,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,200,150,30);
        id15.add(t5);

        id6= new JLabel("Mobile No:");
        id6.setBounds(400,200,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));    
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,200,150,30);
        id15.add(t6);

        id7= new JLabel("Email ID:");
        id7.setBounds(50,250,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,250,150,30);
        id15.add(t7);

        id9= new JLabel("Branch:");
        id9.setBounds(400,250,150,30);  
        id9.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(600,250,150,30);
        id15.add(t8);

        id10= new JLabel("Course:");
        id10.setBounds(400,300,150,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(600,300,150,30);
        id15.add(t9);

        id11= new JLabel("Student ID");
        id11.setBounds(230,360,150,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setEditable(false);
        t10.setBounds(400,360,150,30);
        id15.add(t10);

        id12= new JLabel("Class XII(%): ");
        id12.setBounds(50,300,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();
        t11.setBounds(200,300,150,30);
        id15.add(t11);
        f.setVisible(false); 




        // Buttons
        b=new JButton("UPDATE");
        b.setForeground(Color.WHITE);
        b.setBackground(green);
        b.setFont(new Font("serif",Font.TYPE1_FONT,15));
        b.setBounds(250,450,130,40);
        b.addActionListener(this);
        id15.add(b);

        b1=new JButton("CANCEL");
        b1.setForeground(Color.WHITE);
        b1.setBackground(red);
        b1.setFont(new Font("serif",Font.TYPE1_FONT,15));
        b1.setBounds(450,450,130,40);
        b1.addActionListener(this);
        id15.add(b1);

        showData(idaa);
    }

    int i=0;
    String age,dat;

    void showData(String s){
        try{
            conn con = new conn();
            String str = "select * from student where student_id = '"+s+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()){
                f.setVisible(true);
                i=1;

                t1.setText(rs.getString(1));
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(3));
                t4.setText(rs.getString(4));
                t5.setText(rs.getString(5));
                t6.setText(rs.getString(6));
                t7.setText(rs.getString(7));
                t8.setText(rs.getString(8));
                t9.setText(rs.getString(9));
                t10.setText(rs.getString(10));
                t11.setText(rs.getString(11));


                age=rs.getString(3);
                dat=rs.getString(4);
            }
            if(i==0)
                JOptionPane.showMessageDialog(null,"OOPS, ID not found");
            new SearchStudent();
        }catch(Exception ex){
            ex.printStackTrace();
        }

        f.setVisible(true);
        f.setSize(900,600);
        f.setLocation(400,100);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b && i==1){
            try{
                conn con = new conn();
                String str = "update student set name='"+t1.getText()+"',father_name='"+t2.getText()+"',age='"+t3.getText()+"'," +
                        "dob='"+t4.getText()+"',address='"+t5.getText()+"',mobile_no='"+t6.getText()+"',email_id='"+t7.getText()+"'," +
                        "branch='"+t8.getText()+"',course='"+t9.getText()+"',student_id='"+t10.getText()+"'," +
                        "class_xii_percent='"+t11.getText()+"' where student_id='"+ student_id +"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"Successfully Updated");
                f.setVisible(false);
                new SearchStudent();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            Dashboard d=new Dashboard();
        }
    }

    public static void main(String[] arg){
        new UpdateStudent("Update Student");
    }
}