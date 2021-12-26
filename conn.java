package HotelManagementSystem;


import java.sql.*;

public class conn {

	Connection c;
	Statement s;
	
	public conn() {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Projecthms?autoReconnect=true&useSSL=false","root","Password@514");
			s = c.createStatement();		
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
				
	}
}