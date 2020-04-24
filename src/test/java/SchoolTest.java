import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.oop.lambda.student.School;
import ru.job4j.oop.lambda.student.Student;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    List<Student> studPool = new ArrayList<Student>();
    @Before
    public void init() {
        studPool.add(new Student("A", 0));
        studPool.add(new Student("B", 25));
        studPool.add(new Student("C", 50));
        studPool.add(new Student("D", 75));
        studPool.add(new Student("E", 100));
    }
    @After
    public void clear() {
        studPool.clear();
    }
    @Test
    public void studentsOfAClass() {
        List<Student> result = School.collect(studPool, s -> (s.getScore() >= 0) && (s.getScore() < 50));
        List<Student> expected = List.of(
                new Student("A", 0),
                new Student("B", 25)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void studentsOfBClass() {
        List<Student> result = School.collect(studPool, s -> (s.getScore() >= 50) && (s.getScore() < 70));
        List<Student> expected = List.of(
                new Student("C", 50)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void studentsOfCClass() {
        List<Student> result = School.collect(studPool, s -> (s.getScore() >= 70) && (s.getScore() <= 100));
        List<Student> expected = List.of(
                new Student("D", 75),
                new Student("E", 100)
        );
        assertThat(result, is(expected));
    }

    @Test
    public void studentsClassOnMap() {
        Map<String, Student> result = School.collectToMap(studPool);
        Map<String, Student> expected = Map.of(
                "A", new Student("A", 0),
                "B", new Student("B", 25),
                "C", new Student("C", 50),
                "D", new Student("D", 75),
                "E", new Student("E", 100)

        );
        assertThat(result, is(expected));
    }

    @Test
    public void studentsWhichScoreHighThen50() {
        List<Student> result = School.levelOf(studPool, 50);
        List<Student> expected = Arrays.asList(
                new Student("D", 75),
                new Student("E", 100)
        );
        assertThat(result, is(expected));
    }
}
