package ru.job4j.oop.exception;
/**
 * Упр. 0.4. Пользовательские исключения.[#245072]
 * @author Kirill Asmanov
 * @since 27.03.2020
 * @version 1.0.0;
 */

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException(String message) {
        super(message);
    }
}
