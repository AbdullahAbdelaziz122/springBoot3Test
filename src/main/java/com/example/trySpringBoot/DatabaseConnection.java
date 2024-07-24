//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class DatabaseConnection {
//    public static void main(String[] args) {
//        // Database credentials
//        String url = "jdbc:postgresql://localhost:5432/mydb";
//        String user = "Abdullah";
//        String password = "0000";
//
//        Connection conn = null;
//        Statement stmt = null;
//        ResultSet rs = null;
//
//        try {
//            // Load the PostgreSQL JDBC driver
//            Class.forName("org.postgresql.Driver");
//
//            // Establish the connection
//            conn = DriverManager.getConnection(url, user, password);
//            System.out.println("Connected to the PostgreSQL server successfully.");
//
//            // Create a statement
//            stmt = conn.createStatement();
//
//            // Execute a query
//            String sql = "SELECT id, name, email FROM users";
//            rs = stmt.executeQuery(sql);
//
//            // Process the result set
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                String email = rs.getString("email");
//                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            // Clean up and close resources
//            try {
//                if (rs != null) rs.close();
//                if (stmt != null) stmt.close();
//                if (conn != null) conn.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
