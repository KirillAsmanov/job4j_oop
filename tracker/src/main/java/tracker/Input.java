package tracker;
/**
 * Интерфейс ввода данных
 * tracker
 * @author Kirill Asmanov
 * @since 23.03.2020
 */
public interface Input {
    /**
     * просит пользователя ввести строку
     * @param question - входное сообщение
     * @return - введенная строка
     */
    String askStr(String question);

    /**
     * просит пользователя ввести число
     * @param question - входное сообщение
     * @return - введенное число
     */
    int askInt(String question);
}
