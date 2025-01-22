package design_patterns.singleton.eager_intilization;

public class DbConnection {
    public String URL;
    public String password;

    private static DbConnection instance = new DbConnection();

    private DbConnection() {
        this.URL = "jdbc:oracle:thin:@localhost:1521:orcl";
        this.password = "orcl";
    }

    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }
}
