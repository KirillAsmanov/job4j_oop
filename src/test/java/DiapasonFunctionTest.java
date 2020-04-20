import org.junit.Test;
import ru.job4j.oop.lambda.function.DiapasonFunction;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class DiapasonFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = new DiapasonFunction().diapason(5, 8, x -> (2 * x) + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenSquareFunctionThenSquareResults() {
        List<Double> result = new DiapasonFunction().diapason(2, 5, x -> Math.pow(x, 2) - 1);
        List<Double> expected = Arrays.asList(3D, 8D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        List<Double> result = new DiapasonFunction().diapason(0, 3, x -> Math.pow(3, x));
        List<Double> expected = Arrays.asList(1D, 3D, 9D);
        assertThat(result, is(expected));
    }
}
