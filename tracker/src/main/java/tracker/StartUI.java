package tracker;

import java.util.Scanner;
/**
 * Класс интерфейса программы
 * tracker
 * @author Kirill Asmanov
 * @since 23.03.2020
 */
public class StartUI {
    /**
     * Осуществляет связь между элементами меню и логикой приложения
     * @param scanner - scanner
     * @param tracker - экземпляр хранилища
     */
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Showing all items ====");
                Item[] elements = tracker.findAll();
                printArray(elements);
            } else if (select == 2) {
                System.out.println("=== Edit item ====");
                System.out.println("Enter item's id:");
                String id = scanner.nextLine();
                System.out.println("Enter new item's name:");
                String name = scanner.nextLine();
                Item replaceable = new Item(name);
                if (tracker.replace(id, replaceable)) {
                    System.out.println("Item with number " + id + " replaced successfully.");
                } else {
                    System.out.println("Item with id " + id + " not found.");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ====");
                System.out.println("Enter item's id:");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Item with number " + id + " deleted successfully.");
                } else {
                    System.out.println("Item with id " + id + " not found.");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by id ====");
                System.out.println("Enter item's id:");
                String id = scanner.nextLine();
                Item found = tracker.findById(id);
                if (found != null) {
                    System.out.println(found.getName());
                } else {
                    System.out.println("Item with id " + id + " not found.");
                }
            } else if (select == 5) {
                System.out.println("=== Find item by name ====");
                System.out.println("Enter item's name:");
                String name = scanner.nextLine();
                Item[] selected = tracker.findByName(name);
                if (selected.length != 0) {
                    printArray(selected);
                } else {
                    System.out.println("Item with name " + name + " not found.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    /**
     * Выводит в консоль меню приложения
     */
    private void showMenu() {
        System.out.println("==== Menu ====\n"
        + "0. Add new Item\n"
        + "1. Show all items\n"
        + "2. Edit item\n"
        + "3. Delete item\n"
        + "4. Find item by Id\n"
        + "5. Find items by name\n"
        + "6. Exit Program\n"
        );
    }

    /**
     * Выводит в консоль каждый элемент в массиве
     * @param items - входящий массив
     */
    private void printArray(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            Item item = items[i];
            System.out.println(item.getId() + ". " + item.getName());
        }
        System.out.println("==== End of array ====");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
