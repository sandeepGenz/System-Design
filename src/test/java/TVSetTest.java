package src.test.java;
import static org.junit.jupiter.api.Assertions.*;
import src.main.java.SingletonDP.TVSet;
import org.junit.jupiter.api.Test;
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
}


