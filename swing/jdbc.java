import java.sql.*;

public class jdbc {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost", null, null)

        } catch (Exception e) {
                // TODO: handle exception
        }
    }
}
