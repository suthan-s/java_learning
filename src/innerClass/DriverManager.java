package innerClass;

public class DriverManager {
    static Connection getConnection() {
        Connection con = new Connection() {  // anonymous inner class
            @Override
            public void createStatement() {
                System.out.println("Creating statement");

            }
        };
        return con;
    }
}
