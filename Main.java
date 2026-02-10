import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Option A: Manual Thread
        new Thread(new SimpleTask()).start();

        // Option B: Executor Service (Uncomment to use)
        // ExecutorService executor = Executors.newSingleThreadExecutor();
        // executor.execute(new SimpleTask());
        // executor.shutdown();
    }
}
