package ru.job4j.oop.pojo;
/**
 * Класс библиотеки для проведения операций с книгами
 * 3. Массивы и модели.[#245102]
 * @author Kirill Asmanov
 * @since 21.03.2020
 */
public class Library {
    /**
     * Выводит в консоль информацию о книгах в массиве
     * @param shelf - массив с книгами
     */
    public void printShelf(Book[] shelf) {
        for (int i = 0; i < shelf.length; i++) {
            System.out.println("Название: " + shelf[i].getName() + ". Кол-во страниц: " + shelf[i].getCountOfPages());
        }
    }

    /**
     * Меняет местами книги в массиве
     * @param shelf - массив с книгами
     * @param source - книга, которую необходимо заменить
     * @param destination - книга, на которую необходимо заменить
     */
    public void changeBook(Book[] shelf, int source, int destination) {
        Book temp = shelf[source];
        shelf[source] = shelf[destination];
        shelf[destination] = temp;
    }

    /**
     * Ищет книгу с определенным названием в массиве и выводит информацию о ней на консоль
     * @param shelf - массив с книгами
     * @param findName - искомое название
     */
    public void findBook(Book[] shelf, String findName) {
        for (int i = 0; i < shelf.length; i++) {
            if (findName.equals(shelf[i].getName())) {
                System.out.println("Название: " + shelf[i].getName() + ". Кол-во страниц: " + shelf[i].getCountOfPages());
            }
        }
    }

    public static void main(String[] args) {
        Library library = new Library();
        Book firstBook = new Book("Отцы и дети", 350);
        Book secondBook = new Book("Гарри Поттер", 500);
        Book thirdBook = new Book("Clean code", 430);
        Book fourthBook = new Book("История России", 950);

        Book[] shelf = new Book[4];
        shelf[0] = firstBook;
        shelf[1] = secondBook;
        shelf[2] = thirdBook;
        shelf[3] = fourthBook;
        library.printShelf(shelf);

        System.out.println("--------------------------------");
        System.out.println("Меняем местами первую и последнюю книгу");
        library.changeBook(shelf, 0, 3);
        library.printShelf(shelf);

        System.out.println("--------------------------------");
        System.out.println("Выводим в консоль книги с названием \"Clean code\"");
        library.findBook(shelf, "Clean code");
    }
}
