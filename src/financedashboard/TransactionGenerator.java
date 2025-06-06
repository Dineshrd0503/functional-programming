package financedashboard;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.*;

public class TransactionGenerator {
    private final BlockingQueue<Transaction> queue=new LinkedBlockingQueue<>();
    private final ScheduledExecutorService schedule= Executors.newScheduledThreadPool(1);
    private final Random random=new Random();

    public void startgenerating(){
        schedule.scheduleAtFixedRate(() -> {
            Category[] categories = Category.values();
            boolean isincome=random.nextBoolean();
            double amount = isincome?random.nextDouble() * 1000+500:random.nextDouble()*200+10; // Random amount between 0 and 1000
            Transaction transcation=new Transaction(
                amount,
                categories[random.nextInt(categories.length)],
                LocalDateTime.now(),
                    isincome?"Income":"Expense",
                isincome
            );
            queue.offer(transcation);


        },        0, 2, TimeUnit.SECONDS); // Generate a new transaction every second
    }

    public BlockingQueue<Transaction> getQueue() {
        return queue;
    }

    public void stop(){
        schedule.shutdown();
    }
}
