package Java.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class insertData {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/student";
            String username="root";
            String password="Tmanna";
            Connection connection=DriverManager.getConnection(url,username,password);

            // create query
            String q="create table table1(tid int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
            //create statement
            Statement statement=connection.createStatement();
            statement.executeUpdate(q);
            System.out.println("table created");
            connection.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
