package com.user.Authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// data persistence layer
public class mysqldb implements interface_for_data {

	public boolean mysqldata(User ref) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbsassignments", "root","root125");
			
    String query="select * from App_Users where  username =? and password=?";
	PreparedStatement pstm=con.prepareStatement(query);
					 
					pstm.setString(1,ref.getUsername());
				    pstm.setString(2, ref.getPassword());
					ResultSet rs=pstm.executeQuery();
					return rs.next();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	@Override
	public boolean verifydata(User ref) {
		return mysqldata(ref);
	}
         
}
