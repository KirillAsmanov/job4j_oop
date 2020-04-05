import org.junit.Ignore;
import org.junit.Test;
import ru.job4j.oop.collections.ConvertMatrixToList;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrixToListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrixToList list = new ConvertMatrixToList();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}
