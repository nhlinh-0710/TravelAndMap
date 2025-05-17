package BE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {

    public static Connection getConnection() {
        try {
            // ✅ URL chuẩn để kết nối MySQL trong XAMPP
            String url = "jdbc:mysql://localhost:3306/currencydb?useSSL=false&serverTimezone=UTC";
            String user = "root";       // ✅ Tài khoản mặc định của XAMPP
            String password = "";       // ✅ Mật khẩu trống nếu bạn không đổi

            // ✅ Tải driver JDBC MySQL (bắt buộc để tránh lỗi ClassNotFound)
            Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException e) {
            System.err.println("❌ Không tìm thấy JDBC Driver. Hãy chắc chắn đã thêm mysql-connector-j-x.jar vào Libraries.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("❌ Kết nối MySQL thất bại. Kiểm tra XAMPP, database, và URL.");
            e.printStackTrace();
        }

        return null;
    }
}
