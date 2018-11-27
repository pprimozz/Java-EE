package com.telusko.web.dao;
import java.sql.*;
import com.telusko.web.model.Alien;

public class AlienDao {
	
	
	public Alien getALien(int aid) {
		
		Alien a= new Alien();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/navin", "root", "root");
			Statement st = con.createStatement();
		    ResultSet rs =	st.executeQuery("select * from alien where aid="+aid);
		    if(rs.next()) {
		    	a.setAid(rs.getInt("aid"));
		    	a.setAname(rs.getString("aname"));
		    	a.setTech(rs.getString("tech"));
		    }
		}
		
		catch (Exception e) {System.out.println(e);}
		
		return a;
	}
	
	public void createAlien(int aid, String aname, String tech) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/navin", "root", "root");

			PreparedStatement st = con.prepareStatement("insert into alien values(?,?,?)");
			st.setInt(1, aid);
			st.setString(2, aname);
			st.setString(3, tech);
			st.executeUpdate();
		 
		}
		
		catch (Exception e) {System.out.println(e);}
		
	}

}
