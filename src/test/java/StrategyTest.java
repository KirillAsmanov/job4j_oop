import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.oop.strategy.Paint;
import ru.job4j.oop.strategy.Square;
import ru.job4j.oop.strategy.Triangle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StrategyTest {
    private final PrintStream stdout = System.out;
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
    }

    @Test
    public void whenDrawSquare() {
        new Paint().draw(new Square());
        assertThat(
                this.out.toString(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+ + + +")
                                .add("+     +")
                                .add("+     +")
                                .add("+ + + +")
                                .toString()
                )
        );
    }

    @Test
    public void whenDrawTriangle() {
        new Paint().draw(new Triangle());
        assertThat(
                this.out.toString(),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("   +   ")
                                .add("  + +  ")
                                .add(" +   + ")
                                .add("+ + + +")
                                .toString()
                )
        );
    }
}