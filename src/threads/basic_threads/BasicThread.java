package threads.basic_threads;

public class BasicThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World");
        System.out.println("I am running on thread " + java.lang.Thread.currentThread().getName());
    }
}
