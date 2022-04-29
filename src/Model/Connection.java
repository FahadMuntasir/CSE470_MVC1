package Model;

import java.sql.*;  

public class Connection{
    java.sql.Connection c;
    public Statement s;
    public Connection(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql://localhost:3306/bm?useSSL=false","root","helloworld");    
            s =c.createStatement(); 
     
        }catch(ClassNotFoundException | SQLException e){ 
            System.out.println(e);
        }  
    }  
}  