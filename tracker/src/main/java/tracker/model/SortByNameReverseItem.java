package tracker.model;

import java.util.Comparator;
/**
 * 0. Сортировка[#244999]
 * Реализует компаратор по убыванию по имени
 * @author Kirill Asmanov
 * @since 24.03.2020
 */
public class SortByNameReverseItem implements Comparator<Item> {
    @Override
    public int compare(Item o1, Item o2) {
        int rsl;
        switch (o1.getName().compareTo(o2.getName())) {
            case  (1):
                rsl = -1;
                break;
            case (-1):
                rsl = 1;
                break;
            default:
                rsl = 0;
                break;
        }
        return rsl;
    }
}
