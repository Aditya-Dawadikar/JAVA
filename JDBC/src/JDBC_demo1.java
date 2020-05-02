import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class JDBC_demo1 {

    public static void main(String args[]) throws ClassNotFoundException, SQLDataException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        try {
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chandler","chandler");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("connection Successful");
    }
}

/*
Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","visionware","visionware");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from emp");
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		System.out.println("Connection Success...");
*/