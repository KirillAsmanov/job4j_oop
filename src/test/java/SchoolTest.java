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
        List<Student> classA = School.collect(studPool, s -> (s.getScore() >= 0) && (s.getScore() < 50));
        assertThat(classA.get(1).getScore(), is(25));
    }

    @Test
    public void studentsOfBClass() {
        List<Student> classA = School.collect(studPool, s -> (s.getScore() >= 50) && (s.getScore() < 70));
        assertThat(classA.get(0).getScore(), is(50));
    }

    @Test
    public void studentsOfCClass() {
        List<Student> classA = School.collect(studPool, s -> (s.getScore() >= 70) && (s.getScore() <= 100));
        assertThat(classA.get(1).getScore(), is(100));
    }

    @Test
    public void studentsClassOnMap() {
        Map<String, Student> classA = School.collectToMap(studPool);
        assertThat(classA.get("C"), is(new Student("C", 50)));
    }
}
