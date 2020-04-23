import org.junit.Test;
import ru.job4j.oop.collections.ConvertList;
import ru.job4j.oop.collections.fullsearch.Task;
import ru.job4j.oop.lambda.student.School;
import ru.job4j.oop.lambda.student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void studentsOfAClass() {
        List<Student> studPool = new ArrayList<Student>();
        studPool.add(new Student(0));
        studPool.add(new Student(25));
        studPool.add(new Student(50));
        studPool.add(new Student(75));
        studPool.add(new Student(100));
        List<Student> classA = School.collect(studPool, s -> (s.getScore() >= 0) && (s.getScore() < 50));

        assertThat(classA.get(1).getScore(), is(25));
    }

    @Test
    public void studentsOfBClass() {
        List<Student> studPool = new ArrayList<Student>();
        studPool.add(new Student(0));
        studPool.add(new Student(25));
        studPool.add(new Student(50));
        studPool.add(new Student(75));
        studPool.add(new Student(100));
        List<Student> classA = School.collect(studPool, s -> (s.getScore() >= 50) && (s.getScore() < 70));

        assertThat(classA.get(0).getScore(), is(50));
    }

    @Test
    public void studentsOfCClass() {
        List<Student> studPool = new ArrayList<Student>();
        studPool.add(new Student(0));
        studPool.add(new Student(25));
        studPool.add(new Student(50));
        studPool.add(new Student(75));
        studPool.add(new Student(100));
        List<Student> classA = School.collect(studPool, s -> (s.getScore() >= 70) && (s.getScore() <= 100));

        assertThat(classA.get(1).getScore(), is(100));
    }
}
