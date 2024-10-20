import java.sql.*;

public class DB {
    public static Connection getConnection() {
        Connection con = null;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib", "root", "@Rajya12345");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    public static void main(String[] args) {
        Connection connection = getConnection();
        if (connection != null) {
            System.out.println("Connection successful!");
            // You can perform other operations using the 'connection' object here
        } else {
            System.out.println("Connection failed!");
        }
    }
}
