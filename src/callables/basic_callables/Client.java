package callables.basic_callables;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        ExecutorService pool = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Future<Integer> submit = pool.submit(rng);
            try {
                Integer num = submit.get();
                System.out.println("The num is number: " + num);
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        pool.shutdown();
    }
}
