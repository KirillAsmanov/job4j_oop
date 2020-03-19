import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;

public class PointTest {
    @Test
    public void distance() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double excepted = 2;
        double out = a.distance(b);
        Assert.assertEquals(excepted, out, 0.01);
    }

    @Test
    public void distanceThreeDimensions() {
        Point a = new Point(0, 0, 2);
        Point b = new Point(0, 0, 0);
        double excepted = 2;
        double out = a.distance3d(b);
        Assert.assertEquals(excepted, out, 0.01);
    }
}
