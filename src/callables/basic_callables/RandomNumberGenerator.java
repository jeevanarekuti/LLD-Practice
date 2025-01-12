package callables.basic_callables;

import java.util.Random;
import java.util.concurrent.Callable;

public class RandomNumberGenerator implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        Random rand = new Random();
        int num =  rand.nextInt(100);
        System.out.println("Random number is generated now sleeping");
        try {
            System.out.println("Thread " + Thread.currentThread().getName() + " sleeping");
            Thread.sleep(1000);
        }
        catch (Exception e) {
            System.out.println("Exception occured");
        }
        return num;
    }
}
