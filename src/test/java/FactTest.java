import org.junit.Test;
import ru.job4j.oop.exception.Fact;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;


public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenArgLesserThen0() {
        int rsl = new Fact().calc(-4);
    }

    @Test
    public void whenArg3then6() {
        int rsl = new Fact().calc(3);
        assertThat(rsl, is(6));
    }
}
