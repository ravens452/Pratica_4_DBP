import java.sql.*;
import java.util.Properties;

public class MySQLConnectExample {

    public static void main(String[] args) {

        // creates three different Connection objects
        Connection conn1 = null;
//        Connection conn2 = null;
//        Connection conn3 = null;

        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/javaweb_crud";
            String user = "root";
            String password = "123456789";
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test1");
            }

            Statement stat = conn1.createStatement();
            String sql = "select * from articulos";
            ResultSet rs = stat.executeQuery(sql);
            while (rs.next()){
                int id_col = rs.getInt("ID");
                String name = rs.getString("nombre");
                String description = rs.getString("descripcion");

                String p = id_col + " --- " + name + " --- "+description+" --- ";
                System.out.println(p);
            }




//            // connect way #2
//            String url2 = "jdbc:mysql://localhost:3306/test2?user=root&password=P@ssw0rd";
//
//            conn2 = DriverManager.getConnection(url2);
//            if (conn2 != null) {
//                System.out.println("Connected to the database test2");
//            }
//
//
//            // connect way #3
//            String url3 = "jdbc:mysql://localhost:3306/test3";
//            Properties info = new Properties();
//            info.put("user", "root");
//            info.put("password", "P@ssw0rd");
//
//            conn3 = DriverManager.getConnection(url3, info);
//            if (conn3 != null) {
//                System.out.println("Connected to the database test3");
//            }

        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
    }
}