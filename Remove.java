
import java.sql.*;

public class Remove {

	public static void main(String[] args)throws Exception {
		String uname="root";
		String pwd="";
		String url="jdbc:mysql://localhost:3306/munna";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection(url,uname,pwd);
		Statement st=cn.createStatement();
		String q="Delete from student where faculty='ce'";
		int i=st.executeUpdate(q);
		
		System.out.println("total deleted="+i);
		
		cn.close();
	}

}