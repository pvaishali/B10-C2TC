
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public class jdbc {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","latchu20");
		
    Statement st=con.createStatement();
String query="create table student(id int primary key,sname varchar(20)";
st.executeUpdate(query);
System.out.println("table created");
st.close();
con.close();
}
}
