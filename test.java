package Java.JDBC;
import java.sql.*;

public class test {
    public static void main(String[] args) {
        try{
    //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //creating connection
            String url="jdbc:mysql://localhost:3306/student";
            String username="root";
            String password="Tmanna";
            Connection connection=DriverManager.getConnection(url,username,password);
            if(connection.isClosed()){
                System.out.println("connection is still close");
            }else{
                System.out.println("connection created....");
            }
        }catch(Exception e) {
            e.printStackTrace();
            // throw new RuntimeException(e);
        }
    }
}
