package design_patterns.singleton.synchronized_method;

import design_patterns.singleton.FailsMultiThreading.DbConnection;

public class Client {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            public void run() {
                DbConnection dbConnection = DbConnection.getInstance();
                System.out.println(dbConnection.password);
                System.out.println(dbConnection.URL);
            }
        };

        Thread t1 = new Thread(runnable);
        t1.start();
        Thread t2 = new Thread(runnable);
        t2.start();

    }
}
