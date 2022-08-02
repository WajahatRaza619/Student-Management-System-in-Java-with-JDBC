import java.sql.Connection;
import java.sql.DriverManager;
public class CP {
	static Connection con;
	public static Connection create_con() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String user="root";
		String password="Password@123";
		String url="jdbc:mysql://localhost:3306/student_manage";
		con=DriverManager.getConnection(url,user,password);
		}catch(Exception e){
			e.printStackTrace();
		}
		return con;
	}

}
