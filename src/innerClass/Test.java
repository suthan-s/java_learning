package innerClass;

public class Test {
    public static void main(String[] args) {
        Connection obj = DriverManager.getConnection();
        obj.createStatement();
    }
}
