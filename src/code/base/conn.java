package code.base;

import java.sql.*;

public class conn{
    
    public Connection c;
    public Statement s;
 
    public conn(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/university","root","&@N984937284n");
            s = c.createStatement();
            
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
 
