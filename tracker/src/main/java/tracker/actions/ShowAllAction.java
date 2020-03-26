package tracker.actions;

import tracker.Input;
import tracker.Item;
import tracker.Tracker;
/**
 * Класс команды вывода всех элементов в массиве в консоль
 * tracker
 * @author Kirill Asmanov
 * @since 26.03.2020
 */
public class ShowAllAction implements UserAction {
    /**
     * содержит имя операции
     *
     * @return - имя
     */
    @Override
    public String name() {
        return "=== Showing all items ===";
    }

    /**
     * Выполняет операцию вывода всех элементов в консоль
     *
     * @param input - вводимые данные
     * @param tracker - хранилище данных
     * @return - true, если это не операция выхода из системы
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] allItems = tracker.findAll();
        for (int i = 0; i < allItems.length; i++) {
            Item item = allItems[i];
            System.out.println(item.getId() + ". " + item.getName());
        }
        System.out.println("==== End of array ====");
        return true;
    }
}
