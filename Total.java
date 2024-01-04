import java.sql.*;

public class Total {

	public static void main(String[] args)throws Exception {
		String uname="root";
		String pwd="";
		String url="jdbc:mysql://localhost:3306/munna";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection(url,uname,pwd);
		Statement st=cn.createStatement();
		String q="select count(roll)from student";
		ResultSet r=st.executeQuery(q);
		r.next();
		System.out.println("Count="+r.getInt(1));
		
		cn.close();
	}

}