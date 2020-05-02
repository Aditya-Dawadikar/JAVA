import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {


        static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
        static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
        static final String user="chandler";
        static final String pass="chandler";

        Connection con;
        Statement stmt;

        CreateTables()throws SQLException, ClassNotFoundException{
            Class.forName(JDBC_driver);
            con=null;stmt=null;
            con= DriverManager.getConnection(DB_URL,user,pass);
            stmt=con.createStatement();
        }

        void AddJob() throws SQLException{
            String sql="create table add_job(name varchar(15),title varchar(15),city varchar(10),dateofpost varchar(10),description varchar(40),skills varchar(30),"
            		+ "                      jobtype varchar(10)";
            stmt.executeUpdate(sql);
            System.out.println("table created");
        }
      


        public static void main(String []args) throws SQLException,ClassNotFoundException {
            CreateTables ct=new CreateTables();
            ct.AddJob();
        }

}
