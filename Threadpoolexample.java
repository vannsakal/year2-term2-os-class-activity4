import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpoolexample {
    public static void main(String[] args) {
        // Check if argument exists to avoid errors
        if (args.length == 0) {
            System.out.println("Please provide a number of tasks: java Threadpoolexample 5");
            return;
        }

        int num = Integer.parseInt(args[0]);
        ExecutorService pool = Executors.newCachedThreadPool();

        for (int i = 0; i < num; i++) {
            pool.execute(new SimpleTask());
        }
        pool.shutdown(); // Good practice to shut down the pool
    }
}
