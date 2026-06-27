package banking;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{
    static DBConnection con;

    public static DBConnection getConnection() {
        try {
            String mysqlJDBCDriver = "com.mysql.cj.jdbc.Driver"; 
            String url = "jdbc:mysql://localhost:3306/BANK"; 
            String user = "root";        
            String pass = "your_mysql_password";  

            Class.forName(mysqlJDBCDriver);
            con = (DBConnection) DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            System.out.println("Connection Failed! " + e.getMessage());
        }
        return con;
    }
}
