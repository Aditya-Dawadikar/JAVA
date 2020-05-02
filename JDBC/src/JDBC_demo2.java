import java.sql.*;

class JDBC_demo2{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","chandler","chandler");

            //System.out.println("connection established");

            Statement stmt=con.createStatement();
            stmt.execute("INSERT INTO EMP VALUES(4,'ople')");

            //System.out.println("Statement created and executed");

            ResultSet rs=stmt.executeQuery("SELECT * FROM emp");
            //System.out.println("query fired");
            System.out.println("id\tname");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2));
            }
            //System.out.println("Connection Success...");
    }
}
