import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
static String userName="root";
    static String password="12345";

    public static void main(String[] args) {
        String dbUrl="jdbc:postgresql://localhost:5434/dbUrun2";
        Connection connection=null;

            try {
                connection= DriverManager.getConnection(dbUrl);
            } catch (SQLException e) {
                e.printStackTrace();
            }

    }
}
