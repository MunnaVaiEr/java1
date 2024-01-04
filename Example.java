import java.sql.*;

public class Example {

	public static void main(String[] args)throws Exception {
		String uname="root";
		String pwd="";
		String url="jdbc:mysql://localhost:3306/munna";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection(url,uname,pwd);
		Statement st=cn.createStatement();
		String q="select *from student where faculty='IT'";
		ResultSet r=st.executeQuery(q);
		while(r.next()) {
			System.out.println(r.getInt(1)  +" "+r.getString(2)  +" "+r.getString(3)  +" "+r.getFloat(4))  ;
		}
		cn.close();
	}

}
