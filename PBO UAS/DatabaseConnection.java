import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/uas_pbo";
    private static final String USER = "root";
    private static final String PASSWORD = ""; // Kosongkan jika Anda tidak menggunakan password di XAMPP

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

