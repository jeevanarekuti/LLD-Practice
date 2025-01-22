package design_patterns.singleton.synchronized_method;

public class DbConnection {
    String URL;
    String password;

    private static DbConnection instance;

    private DbConnection() {
        this.URL = "jdbc:oracle:thin:@localhost:1521:orcl";
        this.password = "orcl";
    }

    public static synchronized DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
            return instance;
        }
        else{
            DbConnection.instance.URL = "jdbc:orcl";
            return instance;
        }
    }
}
