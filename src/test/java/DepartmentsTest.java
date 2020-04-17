import org.junit.Test;
import ru.job4j.oop.collections.sort.DepDescComp;
import ru.job4j.oop.collections.sort.Departments;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class DepartmentsTest {

    @Test
    public void whenHasNotK2department() {
        List<String> deps = Arrays.asList(
                "K2/SK1"
        );
        boolean expected = Departments.fillGaps(deps).contains("K2");
        assertThat(expected, is(true));
    }

    @Test
    public void whenDepartmentsSortAsc() {
        List<String> deps = Arrays.asList(
                "K1",
                "K2",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2/SK1"
        );

        List<String> expected = Arrays.asList(
                "K1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1"
        );
        Departments.sortAsc(deps);
        assertThat(deps, is(expected));
    }

    @Test
    public void whenDepartmentsSortDesc() {
        List<String> deps = Arrays.asList(
                "K1",
                "K2",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2/SK1"
        );
        List<String> expected = Arrays.asList(
                "K2",
                "K2/SK1",
                "K1",
                "K1/SK1/SSK2",
                "K1/SK2"
        );
        Departments.sortDesc(deps);
        assertThat(deps, is(expected));
    }
}
