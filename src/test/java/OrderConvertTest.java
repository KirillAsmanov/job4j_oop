import org.junit.Test;
import ru.job4j.oop.collections.convert.Order;
import ru.job4j.oop.collections.convert.OrderConvert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("3sfe", "Dress"));
        HashMap<String, Order> result = OrderConvert.process(orders);
        Map<String, Order> expected = Map.of(
                "3sfe", new Order("3sfe", "Dress")
        );
        assertThat(result, is(expected));
    }
}
