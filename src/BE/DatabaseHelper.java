package BE;

import java.sql.*;

public class DatabaseHelper {
    private static final String URL = "jdbc:mysql://localhost:3306/travelandmap";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean kiemTraSoDienThoai(String phoneNumber) {
        try (Connection conn = getConnection()) {
            if (conn == null) return false;
            String query = "SELECT * FROM tbl_thongtinnguoidung WHERE phone_number = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, phoneNumber);
            ResultSet rs = stmt.executeQuery();
            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}