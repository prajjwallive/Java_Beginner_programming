import java.sql.*;

public class dbcon{
    public static void main(String[] args){
        Connection connection  = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/";
            String user = "";
            String Pass = "";
            connection = DriverManager.getConnection(url, user, Pass);

            System.out.println("Connected to the MySql database!");
        }
        catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(connection !=null){
                    connection.close();
                }
            }
            catch (SQLException e){
                e.printStackTrace();
            }
        }

    }
}

// import java.sql.*;

// public class dbcon {
//     public static void main(String[] args) {
//         Connection con = null;
//         try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
//             String url = "jdbc:mysql://Localhost:3306/";
//             String uname = "";
//             String pswd = "";
//             con = DriverManager.getConnection(url, uname, pswd);
//             System.out.println("Connection Established!\n");
//         } catch (SQLException | ClassNotFoundException e) {
//             e.getStackTrace();
//             } finally {
//             try(con != null){
//             con.close();
//             }
//             catch(SQLException e){
//             e.getStackTrace();
//             }
//         }
//     }
// }