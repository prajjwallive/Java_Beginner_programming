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