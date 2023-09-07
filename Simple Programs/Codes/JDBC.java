import java.sql.*;

public class JDBC {
    static final String url = ("jdbc:mysql://localhost:3306/admin");
    static final String usr = "root";
    static final String psw = "root";

    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usr, psw);
            String sql = "Update USERS SET ID=? WHERE NAMe=?";
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, 5);
            stmt.setString(2, "Live");
            int num = stmt.executeUpdate();
            System.out.println("Affect Rows " + num);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}