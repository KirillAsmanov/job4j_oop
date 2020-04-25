import org.junit.Before;
import org.junit.Test;
import ru.job4j.oop.collections.fullsearch.FullSearch;
import ru.job4j.oop.collections.grouping.Group;
import ru.job4j.oop.collections.grouping.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GroupTest {

    @Test
    public void whenGroupingList() {
        List<Student> studentArrayList = List.of(
                new Student("Кирилл", Set.of("Шахматы", "Бег")),
                new Student("Иван", Set.of("Плавание", "Бег")),
                new Student("Николай", Set.of("Вышивание", "Шахматы"))
        );
        Set<String> result = Group.sections(studentArrayList).get("Бег");
        Set<String> expected = Set.of("Кирилл", "Иван");
        assertThat(result, is(expected));
    }
}
