package tracker.actions;

import tracker.Input;
import tracker.Item;
import tracker.Tracker;
/**
 * Класс команды поиска элементов по имени
 * tracker
 * @author Kirill Asmanov
 * @since 26.03.2020
 */
public class FindByNameAction implements UserAction {
    /**
     * содержит имя операции
     *
     * @return - имя
     */
    @Override
    public String name() {
        return "=== Find items by name ===";
    }

    /**
     * Выполняет операцию поиска по имени и выводит массив найденных элементов в консоль
     *
     * @param input   - вводимые данные
     * @param tracker - хранилище данных
     * @return - true, если это не операция выхода из системы
     */
    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter name: ");
        Item[] founds = tracker.findByName(name);
        if (founds.length != 0) {
            for (int i = 0; i < founds.length; i++) {
                Item item = founds[i];
                System.out.println(item.getId() + ". " + item.getName());
            }
            System.out.println("==== End of array ====");
        } else {
            System.out.println("Cannot find item with entered name.");
        }
        return true;
    }
}