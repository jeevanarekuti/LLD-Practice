package threads.number_printer;

public class Client {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();
        Thread thread = new Thread(printer);
        thread.start();
    }
}
