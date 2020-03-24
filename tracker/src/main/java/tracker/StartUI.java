package tracker;

/**
 * Класс интерфейса программы
 * tracker
 * @author Kirill Asmanov
 * @since 23.03.2020
 */
public class StartUI {
    /**
     * Осуществляет связь между элементами меню и логикой приложения
     * @param input - интерфейс ввода данных
     * @param tracker - экземпляр хранилища
     */
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Enter a number of action: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showItems(input, tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemsByName(input, tracker);
            } else if (select == 6) {
                run = false;
            }
        }
    }

    /**
     * Реализует взаимодействие пользователя с алгоритмом создания и добавления нового элемента в массив
     * @param input - интерфейс ввода данных
     * @param tracker - экземпляр хранилища
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    /**
     * Реализует взаимодействие пользователя с алгоритмом отображения всех not null элементов в массиве
     * @param input - интерфейс ввода данных
     * @param tracker - экземпляр хранилища
     */
    public static void showItems(Input input, Tracker tracker) {
        System.out.println("=== Showing all items ====");
        Item[] elements = tracker.findAll();
        printArray(elements);
    }

    /**
     * Реализует взаимодействие пользователя с алгоритмом редактирования элемента
     * @param input - интерфейс ввода данных
     * @param tracker - экземпляр хранилища
     */
    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ====");
        String id = input.askStr("Enter item's id:");
        String name = input.askStr("Enter new item's name:");
        Item replaceable = new Item(name);
        if (tracker.replace(id, replaceable)) {
            System.out.println("Item with number " + id + " replaced successfully.");
        } else {
            System.out.println("Item with id " + id + " not found.");
        }
    }

    /**
     * Реализует взаимодействие пользователя с алгоритмом удаления элемента из массива
     * @param input - интерфейс ввода данных
     * @param tracker - экземпляр хранилища
     */
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ====");
        String id = input.askStr("Enter item's id:");
        if (tracker.delete(id)) {
            System.out.println("Item with number " + id + " deleted successfully.");
        } else {
            System.out.println("Item with id " + id + " not found.");
        }
    }

    /**
     * Реализует взаимодействие пользователя с алгоритмом поиска заявки по id
     * @param input - интерфейс ввода данных
     * @param tracker - экземпляр хранилища
     */
    public static void findItemById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ====");
        String id = input.askStr("Enter item's id:");
        Item found = tracker.findById(id);
        if (found != null) {
            System.out.println(found.getName());
        } else {
            System.out.println("Item with id " + id + " not found.");
        }
    }

    /**
     * Реализует взаимодействие пользователя с алгоритмом поиска заявок по имени
     * @param input - интерфейс ввода данных
     * @param tracker - экземпляр хранилища
     */
    public static void findItemsByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ====");
        String name = input.askStr("Enter name: ");
        Item[] selected = tracker.findByName(name);
        if (selected.length != 0) {
            printArray(selected);
        } else {
            System.out.println("Item with name " + name + " not found.");
        }
    }

    /**
     * Выводит в консоль меню приложения
     */
    private void showMenu() {
        System.out.println("==== Menu ====" + System.lineSeparator()
                        + "0. Add new Item" + System.lineSeparator()
        + "1. Show all items" + System.lineSeparator()
        + "2. Edit item" + System.lineSeparator()
        + "3. Delete item" + System.lineSeparator()
        + "4. Find item by Id" + System.lineSeparator()
        + "5. Find items by name" + System.lineSeparator()
        + "6. Exit Program" + System.lineSeparator()
        );
    }

    /**
     * Выводит в консоль каждый элемент в массиве
     * @param items - входящий массив
     */
    private static void printArray(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            System.out.println(item.getId() + ". " + item.getName());
        }
        System.out.println("==== End of array ====");
    }


    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
