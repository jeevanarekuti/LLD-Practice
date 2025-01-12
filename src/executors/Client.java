package executors;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            NumberPrinter printer = new NumberPrinter(i);
            executor.execute(printer);
        }
        executor.shutdown();
    }
}
