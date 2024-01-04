
import java.sql.*;
import java.util.Scanner;


public class Inserts {

	public static void main(String[] args)throws Exception {
		Scanner scan=new Scanner(System.in);
		String uname="root";
		String pwd="";
		String url="jdbc:mysql://localhost:3306/munna";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection cn=DriverManager.getConnection(url,uname,pwd);
		PreparedStatement st=cn.prepareStatement("insert into student values(?,?,?,?)");
		int count=0;
		while(true) {
			System.out.println("enter roll");
			int roll=scan.nextInt();
			System.out.println("enter name");
			String name=scan.next();
			System.out.println("enter faculty");
			String faculty=scan.next();
			System.out.println("enter marks");
			float m=scan.nextFloat();
			
			st.setInt(1, roll);
			st.setString(2, name);
			st.setString(3, faculty);
			st.setFloat(4, m);
			
			st.executeUpdate();
			count++;
			
			System.out.println("Type N to exit. Any key to continue");
			String p=scan.next();
			if(p.startsWith("n")) {
				break;
			}
			
			
			
		}
	
		
		System.out.println("total inserted="+count);
		
		cn.close();
	}

}