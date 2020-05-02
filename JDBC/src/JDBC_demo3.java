import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_demo3 {
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chandler","chandler");
        DatabaseMetaData dbmd=con.getMetaData();
        System.out.println(dbmd.getDriverName());
    }
}
