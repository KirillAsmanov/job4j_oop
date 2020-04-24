import org.junit.Test;
import ru.job4j.oop.lambda.MatrixToList;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixToListTest {
    @Test
    public void convertMatrixToList() {
        List<List<Integer>> matrix = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );
        List<Integer> result = MatrixToList.matrixToFlat(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertThat(result, is(expected));
    }

    @Test
    public void convertMatrixToArray() {
        Integer[][] matrix = {
                {1, 2},
                {3, 4}
        };
        List<Integer> result = MatrixToList.matrixToFlat(matrix);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);
        assertThat(result, is(expected));
    }
}
