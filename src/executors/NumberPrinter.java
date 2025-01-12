package executors;

public class NumberPrinter implements Runnable {

    int i;

    NumberPrinter(int num){
        this.i = num;
    }

    @Override
    public void run() {
        System.out.println("Printing number " + i +" using thread " + Thread.currentThread().getName());
    }
}
