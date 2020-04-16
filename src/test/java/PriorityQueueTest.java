import org.junit.Test;
import ru.job4j.oop.collections.priority.PriorityQueue;
import ru.job4j.oop.collections.priority.Task;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PriorityQueueTest {
    @Test
    public void whenHigherPriority() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenPriorityAreEquals() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low",  2));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("urgent2", 1));
        queue.put(new Task("middle", 6));
        Task result = queue.take();
        assertThat(result.getDesc(), is("urgent"));
    }
}
