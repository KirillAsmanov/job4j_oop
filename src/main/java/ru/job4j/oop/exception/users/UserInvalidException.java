package ru.job4j.oop.exception.users;
/**
 * Упр. 0.5. Иерархия исключений и множественный catch.[#245073]
 * @author Kirill Asmanov
 * @since 27.03.2020
 * @version 1.0.0;
 */
public class UserInvalidException extends UserNotFoundException {
    public UserInvalidException(String message) {
        super(message);
    }
}
