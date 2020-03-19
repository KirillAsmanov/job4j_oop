import org.junit.Assert;
import org.junit.Test;
import ru.job4j.oop.Point;
import ru.job4j.oop.TrgArea;


public class TriangleTest {
    @Test
    public void whenExistAndAreaEquals1() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        Point c = new Point(2, 0);
        TrgArea testTrg = new TrgArea(a, b, c);
        double expected = 1;
        double out = testTrg.area();
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDoesNotExist() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        Point c = new Point(7, 0);
        TrgArea testTrg = new TrgArea(a, b, c);
        double expected = -1;
        double out = testTrg.area();
        Assert.assertEquals(expected, out, 0.01);
    }
}
