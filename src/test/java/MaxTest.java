import org.junit.Test;
import ru.job4j.oop.Max;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        assertThat(Max.max(1, 2), is(2));
    }

    @Test
    public void whenMax4To3To1Then4() {
        assertThat(Max.max(4, 3, 1), is(4));
    }

    @Test
    public void whenMax4To3To1To8Then8() {
        assertThat(Max.max(4, 3, 1, 8), is(8));
    }

    @Test
    public void when6AreEqualsThen6() {
        assertThat(Max.max(6, 6, 6, 6), is(6)); }
}
