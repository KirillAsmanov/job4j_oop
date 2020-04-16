import org.junit.Test;
import ru.job4j.oop.collections.sort.*;

import java.util.Comparator;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    /**
     * Тестирование одиночных компараторов
     */
    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("A", 0),
                new Job("B", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorIncByName() {
        Comparator<Job> cmpIncName = new JobIncByName();
        int rsl = cmpIncName.compare(
                new Job("A", 0),
                new Job("B", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("A", 0),
                new Job("A", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenComparatorIncByPriority() {
        Comparator<Job> cmpIncPriority = new JobIncByPriority();
        int rsl = cmpIncPriority.compare(
                new Job("A", 0),
                new Job("A", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    /**
     * Тестирование комбинированных компараторов
     */
    @Test
    public void whenComparatorDescByNameAndPriority() {
        Comparator<Job> cmpDescNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpDescNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorIncByNameAndPriority() {
        Comparator<Job> cmpIncNamePriority = new JobIncByName().thenComparing(new JobIncByPriority());
        int rsl = cmpIncNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}