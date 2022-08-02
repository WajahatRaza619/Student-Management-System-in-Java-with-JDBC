import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
public class StudentDao {

	public static boolean inertStudentToDB(Student st) {
		boolean flag=false;
		try {
		Connection con=CP.create_con();
		String q="Insert into students(name,phone,city) values(?,?,?)";
		PreparedStatement pstm=con.prepareStatement(q);
		pstm.setString(1,st.getStudent_name());
		pstm.setString(2,st.getStudent_phone());
		pstm.setString(3,st.getStudent_city());
		
		pstm.executeUpdate();
		flag=true;
		}catch(Exception e) {
		e.printStackTrace();
		}
		return flag;
	}

	public static boolean deleteStudent(int id) {
		boolean flag=false;
		try {
		Connection con=CP.create_con();
		String q="delete from students where id=?";
		PreparedStatement pstm=con.prepareStatement(q);
		pstm.setInt(1,id);
		
		pstm.executeUpdate();
		flag=true;
		}catch(Exception e) {
		e.printStackTrace();
		}
		return flag;
	}

	public static void showAll() {
		try {
		Connection con=CP.create_con();
		String q="select * from students";
		Statement stmt=con.createStatement();
		ResultSet set=stmt.executeQuery(q);
		
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String phone=set.getString(3);
			String city=set.getString(4);
			
			System.out.println("ID :"+ id);
			System.out.println("Name :"+name);
			System.out.println("Phone Number :"+phone);
			System.out.println("City :"+city);
			System.out.println("------------------------------");
		}
		}catch(Exception e) {
		e.printStackTrace();
		}

	}
		
	}
		
