package threads.basic_threads;

public class Client {
    public static void main(String[] args) {
        BasicThread t = new BasicThread();
        Thread t1 = new Thread(t);
        t1.start();
        System.out.println("Thread is running " + Thread.currentThread().getName());
    }
}
