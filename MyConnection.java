package src;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection {
    public static Connection getConnection(){
        Connection con=null;
        try{
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection("jdbc:mysql://localhost/userregistration","root","");
           //System.out.println("connection created successfully");
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }        
        return con;
    }
   
}
