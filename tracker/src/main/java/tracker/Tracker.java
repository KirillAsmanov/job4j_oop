package tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * Класс хранилища данных
 * tracker
 * @author Kirill Asmanov
 * @since 22.03.2020
 */
public class Tracker {
    /**
     * Массив для хранения заявок
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки
     */
    private int position = 0;

    /**
     * Метод реализующий добавление заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        this.items[position++] = item;
        return item;
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Возвращает копию массива this.items без null элементов
     * @return - массив без null элементов
     */
    public Item[] findAll() {
        return Arrays.copyOf(items, position);
    }

    /**
     * Ищет элементы по имени в массиве
     * @param key - искомое имя
     * @return - массив объектов, с совпадающими с искомым именами
     */
    public Item[] findByName(String key) {
        Item[] chooseByName = new Item[position];
        int size = 0;
        for (int index = 0; index < position; index++) {
            if (key.equals(items[index].getName())) {
                chooseByName[size] = items[index];
                size++;
            }
        }
        chooseByName = Arrays.copyOf(chooseByName, size);
        return chooseByName;

    }

    /**
     * Ищет конкретный объект в массиве по уникальному id
     * @param id - id, который ищем
     * @return искомый объект, либо null, если совпадений по id нет
     */
    public Item findById(String id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    /**
     * Производит поиск индекса по id
     * @param id - id искомого элемента
     * @return найденный индекс, либо -1, если индекса не существует
     */
    private int indexOf(String id) {
        int rsl = -1;
        for (int index = 0; index < position; index++) {
            if (items[index].getId().equals(id)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    /**
     * Меняет значение заявки на другое, при этом сохраняя id
     * @param id - id заявки, которую надо заменить
     * @param item - заявка, на которую надо заменить
     */
    public boolean replace(String id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    /**
     * Удаляет элемент из массива
     * @param id - id удаляемого элемента
     */
    public boolean delete(String id) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            items[index] = null;
            System.arraycopy(items, index + 1, items, index, position - index);
            items[position - 1] = null;
            position--;
            rsl = true;
        }
        return rsl;
    }
}