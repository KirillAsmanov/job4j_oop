package ru.job4j.oop.pojo;
/**
 * Класс магазина, отвечающий за операции над товарами
 * Упр. 3. Удаление моделей из массива.[#245104]
 * @author Kirill Asmanov
 * @since 22.03.2020
 * @version 1.0.0;
 */
public class Shop {
    /**
     * Выводит в косоль значения всех элементов массива товаров
     * @param products - массив товаров
     */
    public void print(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println("-----------------Конец массива-------------------");
    }

    /**
     * Удаляет элемент с заданным индексом из массива, сдвигая все элементы после него на один влево
     * @param products - массив товаров
     * @param index - индекс удаляемого элемента
     * @return - дефрагментированный массив товаров без удаленного элемента
     */
    public Product[] delete(Product[] products, int index) {
        products[index] = null;
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }



    public static void main(String[] args) {
        Shop shop = new Shop();
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);

        shop.print(products);
        shop.print(shop.delete(products, 1));
        shop.print(shop.delete(products, 1));
    }
}
