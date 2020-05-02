import java.sql.*;

public class JobInfo {
	static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
	static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
	static final String user="chandler";
	static final String pass="chandler";
	
	
	static Connection con;
	static Statement stmt;

    public JobInfo() throws ClassNotFoundException, SQLException
    {
    	 Class.forName(JDBC_driver);
         con=null;stmt=null;
         con=DriverManager.getConnection(DB_URL,user,pass);
         stmt=con.createStatement();
    }

    void print(){
		try
		{
			String sql="select * from add_job";
			ResultSet rs=stmt.executeQuery(sql);
			while(rs.next()){
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		JobInfo ji= new JobInfo();
		ji.print();
    }

}


