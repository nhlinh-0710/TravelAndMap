package BE;



import java.sql.*;



public class MySQL {

    private static String DB_URL = "jdbc:mysql://localhost:3306/travelandmap";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    public static void main(String[] args) throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            System.out.println("okkk");
            String sql = "select * from tblsearch";
            PreparedStatement pr = conn.prepareCall(sql);
            ResultSet r1 = pr.executeQuery();
            while(r1.next()){
                System.out.print(r1.getString("DiaChi")  + "-");
                System.out.print(r1.getString("ThanhPho")+ "-");
                System.out.print(r1.getString("GiaiTri")+"\n");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
