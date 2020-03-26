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
    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        assertThat(
                square.draw(),
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
        Triangle trg = new Triangle();
        assertThat(
                trg.draw(),
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

    @Test
    public void whenDrawSquareWithPaint() {
        // получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        // Создаем буфур для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в пямять для тестирования.
        System.setOut(new PrintStream(out));
        // выполняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        // проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringJoiner(System.lineSeparator())
                                .add("+ + + +")
                                .add("+     +")
                                .add("+     +")
                                .add("+ + + +")
                                .toString()
                )
        );
        // возвращаем обратно стандартный вывод в консоль.
        System.setOut(stdout);
    }
}