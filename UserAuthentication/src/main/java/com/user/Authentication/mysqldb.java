package Com.User.Authentication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.mindrot.jbcrypt.BCrypt;

// data persistence layer
public class mysqldb implements interface_for_data {

	public boolean mysqldata(User ref,String work) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fbsassignments", "root","#Ashutosh.snj79");
		if(work.equalsIgnoreCase("verification")){
    String query="select password from App_Users where  username =? ";
	PreparedStatement pstm=con.prepareStatement(query);
					 pstm.setString(1,ref.getUsername());
					 ResultSet rs=pstm.executeQuery();
						if( rs.next()) {
							String pass=rs.getString("password");
					  return  BCrypt.checkpw(ref.getPassword(), pass);
						}

							}
		else if(work.equalsIgnoreCase("ragistration")) {
			String query="insert into App_Users ( username,password ) values (?,?)";
			PreparedStatement pstm=con.prepareStatement(query); 
							pstm.setString(1,ref.getUsername());
						    pstm.setString(2,ref.getPassword());
						int rs=	pstm.executeUpdate();
							if (rs==1) {
								return true;
							}
						    return false;
		
		}
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
		
		return mysqldata(ref,"verification");
	}



	@Override
	public boolean storeData(User ref) {
		
		return mysqldata(ref,"ragistration");
	}
	
         
}
