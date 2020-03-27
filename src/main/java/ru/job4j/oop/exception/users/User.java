package ru.job4j.oop.exception.users;
/**
 * Упр. 0.5. Иерархия исключений и множественный catch.[#245073]
 * @author Kirill Asmanov
 * @since 27.03.2020
 * @version 1.0.0;
 */
public class User {
    /**
     * Содержит логин
     */
    private String username;
    /**
     * Валидность пользователя
     */
    private boolean valid;

    public User(String username, boolean valid) {
        this.username = username;
        this.valid = valid;
    }

    public String getUsername() {
        return username;
    }

    public boolean isValid() {
        return valid;
    }
}
