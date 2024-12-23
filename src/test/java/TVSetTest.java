package src.test.java;
import static org.junit.jupiter.api.Assertions.*;
import src.main.java.TVSet;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TVSetTest {
    @Test
    void testSingletonInstance() {
        // Get two instances of TVSet
        TVSet instance1 = TVSet.getTvSetInstance();
        TVSet instance2 = TVSet.getTvSetInstance();

        // Verify that both instances are the same
        assertSame(instance1, instance2, "Both instances should refer to the same object");
    }

    @Test
    void testNotNullInstance() {
        // Get the instance of TVSet
        TVSet instance = TVSet.getTvSetInstance();

        // Verify that the instance is not null
        assertNotNull(instance, "Instance should not be null");
    }

    @Test
    void testSingletonMultiThread() throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<TVSet> future1 = executorService.submit(()->TVSet.getTvSetInstance());

        /*
        Runnable task = () -> TVSet.getTvSetInstance();
        executorService.submit(task);
         */

        Future<TVSet> future2 = executorService.submit(TVSet::getTvSetInstance);

        TVSet instance1 = future1.get();
        TVSet instance2 = future2.get();

        assertSame(instance1,instance2, "Both instances should refer to the same object");

        executorService.shutdown();

    }
}


