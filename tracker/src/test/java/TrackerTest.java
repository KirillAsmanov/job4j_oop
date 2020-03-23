import org.junit.Test;
import tracker.Item;
import tracker.Tracker;

import java.util.Arrays;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenAddNewThreeItemsAndFindAll() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);

        Item[] result = tracker.findAll();
        Item[] excepted = new Item[] {item1, item2, item3};

        assertThat(result, is(excepted));
    }

    @Test
    public void whenFindByName() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("I have a twin");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        Item item4 = new Item("I have a twin");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);

        Item[] result = tracker.findByName("I have a twin");
        Item[] excepted = new Item[] {item1, item4};

        assertThat(result, is(excepted));
    }

    @Test
    public void whenFindByNameAndHasNoMatches() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("I have a twin");
        Item item2 = new Item("test2");
        Item item3 = new Item("test3");
        Item item4 = new Item("I have a twin");
        tracker.add(item1);
        tracker.add(item2);
        tracker.add(item3);
        tracker.add(item4);

        Item[] result = tracker.findByName("you can't find me");
        Item[] excepted = new Item[0];

        assertThat(result, is(excepted));
    }

    @Test
    public void whenFindByID() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item1);
        tracker.add(item2);

        Item result = tracker.findById(item2.getId());
        assertThat(result.getName(), is(item2.getName()));
    }

    @Test
    public void whenFindByIdAndHasNoMatches() {
        Tracker tracker = new Tracker();
        Item item1 = new Item("test1");
        Item item2 = new Item("test2");
        tracker.add(item1);
        tracker.add(item2);

        Item result = tracker.findById("Such id cannot exist");
        Item excepted = null;
        assertThat(result, is(excepted));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}
