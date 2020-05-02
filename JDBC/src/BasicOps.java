import java.sql.*;
import java.util.Scanner;

public class BasicOps {
    static final String JDBC_driver="oracle.jdbc.driver.OracleDriver";
    static final String DB_URL="jdbc:oracle:thin:@localhost:1521:XE";
    static final String user="chandler";
    static final String pass="chandler";

    Connection con;
    Statement stmt;

    BasicOps()throws SQLException, ClassNotFoundException{
        Class.forName(JDBC_driver);
        con=null;stmt=null;
        con= DriverManager.getConnection(DB_URL,user,pass);
        stmt=con.createStatement();
    }

    void insert() throws SQLException{
        String name;
        int id;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id");
        id=sc.nextInt();
        System.out.println("Enter name");
        name =sc.nextLine();
        name=sc.nextLine();
        stmt.execute("INSERT INTO EMP VALUES("+id+",'"+name+"')");
        stmt.execute("commit");
    }

    void delete() throws SQLException{
        System.out.println("Enter id to be deleted");
        int id;
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
        stmt.execute("Delete from emp where id="+id);
        stmt.execute("commit");
    }

    void display() throws SQLException{
        ResultSet rs=stmt.executeQuery("SELECT * from emp");
        System.out.println("id\tname");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }System.out.println();
    }

    void update() throws SQLException{
        int id;
        String name;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the id to be updated");
        id=sc.nextInt();
        System.out.println("Enter new name");
        name=sc.nextLine();
        name=sc.nextLine();
        stmt.executeQuery("update emp set name='"+name+"' where id="+id);
        stmt.execute("commit");
    }


    /*
    void create() throws SQLException {
        String table;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter table name");
        table=sc.nextLine();
        String sql="create table "+ table +"(id number(10), name varchar(20))";
        stmt.executeUpdate(sql);
        System.out.println("table"+table+"(id, name) created");
    }

    void drop() throws SQLException{
        String table;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter table name");
        table=sc.nextLine();
        stmt.execute("drop table "+table);
        System.out.println("table dropped");
    }

    void display1() throws SQLException{
        String table;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter table name");
        table=sc.nextLine();
        ResultSet rs=stmt.executeQuery("SELECT * from "+table);
        System.out.println("id\tname");
        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2));
        }System.out.println();
    }
     */

    public static void main(String []args) throws SQLException,ClassNotFoundException {
        BasicOps b=new BasicOps();
        int ch;
        do{
            System.out.println("Enter your choice");
            Scanner sc= new Scanner(System.in);

            System.out.println("Menu");
            System.out.println("1.Insert");
            System.out.println("2.Delete");
            System.out.println("3.Update");
            System.out.println("4.Display");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    b.insert();
                    break;
                case 2:
                    b.delete();
                    break;
                case 3:
                    b.update();
                    break;
                case 4:
                    b.display();
                    break;
            }
        }while(ch<5);


        /*
        following are the functions which can be used to create,drop,display any table(id,name)
        b.create();
        b.display1();
        b.drop();

        */
    }
}
