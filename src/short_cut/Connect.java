
package short_cut;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect
{
	private Connection con;
	public Connection getConnection(){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing2","root","Sidharth@123");	
		}
		catch(Exception e){
			System.out.print(e);
		}
		return con;
	}
	public void closeCon(){
		try{
			con.close();
		}
		catch(Exception e){}
	}
}