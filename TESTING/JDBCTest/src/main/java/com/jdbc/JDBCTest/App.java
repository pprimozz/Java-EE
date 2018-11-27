package com.jdbc.JDBCTest;
import java.sql.*;

/**
1. import -->java.sql.*
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
        String url="jdbc:mysql://localhost:3306/testbaza";
        String uname="root";
        String pass="root";
        String query="Select * from alien where id=46";
        
      //  String queryUp="insert into alien values(11,'Sara','lastName')";
        
        
        Connection con = DriverManager.getConnection(url, uname, pass);
        Statement st = con.createStatement();
        ResultSet rs =st.executeQuery(query);
        
       // for (int i=2;i<100;i++) {
        //	String queryUp="insert into alien values("+i+",'Alien -" +i+ "','last - "+i+"')";
        //	  Statement st = con.createStatement();
        //	   st.executeUpdate(queryUp);
       // }
        
        
      
       // System.out.print(count + " rows/s affected");
        
        while(rs.next()) {
        	
        	//String name= rs.getString("name");
            
            System.out.println(rs.getString("id") +" " + rs.getString("name")+" "+rs.getString("lastName"));

        }
        
       
        con.close();
        
        
    }
}
//3306