package ru.job4j.oop.exception.users;

import ru.job4j.oop.exception.ElementNotFoundException;

import java.util.Arrays;
/**
 * Упр. 0.5. Иерархия исключений и множественный catch.[#245073]
 * @author Kirill Asmanov
 * @since 27.03.2020
 * @version 1.0.0;
 */
public class UserStore {
    /**
     * Ищет пользователя с заданным логином в массиве
     * @param users - массив пользователей
     * @param login - искомый логин
     * @return найденный объект User
     * @throws UserNotFoundException - если пользователь с таким значением username отсутствует в массиве
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for (User user:users) {
            if (login.equals(user.getUsername())) {
                rsl = user;
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Cannot find element with this login");
        }
        return rsl;
    }

    /**
     * Проверяет валидность пользователя
     * @param user - проверяемый пользователь
     * @return true, если валиден, false - если нет
     * @throws UserInvalidException - если пользователь не валиден
     */
    public static boolean validate(User user) throws UserInvalidException {
        boolean result = false;
        if ((user.getUsername().length() >= 3) && (user.isValid())) {
            result = true;
        } else {
            throw new UserInvalidException("User isn't valid");
        }
        return result;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true),
                new User("q", true)
        };
        try {
            User user = findUser(users, "q");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}
