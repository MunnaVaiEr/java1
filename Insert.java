
import java.sql.*;


public class Insert {

	public static void main(String[] args)throws Exception {
		String uname="root";
		String pwd="";
		String url="jdbc:mysql://localhost:3306/munna";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection(url,uname,pwd);
		Statement st=cn.createStatement();
		String q="insert into student values(5,'Abc','bca',23)";
		int i=st.executeUpdate(q);
		
		System.out.println("total updated="+i);
		
		cn.close();
	}

}
