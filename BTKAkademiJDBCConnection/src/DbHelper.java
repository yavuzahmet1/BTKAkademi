import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbHelper {
    static String userName="postgres";
    static String password="1234";
    static String dbUrl="jdbc:postgresql://localhost:5434/dbUrun2";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(dbUrl,userName,password);
    }
    public void showErrorMessage(SQLException exception){
        System.out.println("Error : "+exception.getMessage());
    }
}
