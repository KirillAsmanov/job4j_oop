package ru.job4j.oop.collections.transactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 3. Банковские переводы.[#245011]
 * @author Kirill Asmanov
 * @since 09.04.2020
 * @version 1.0.0;
 */
public class BankService {
    /**
     * Хранит данные в формате ключ - пользователь, значение - список его счетов
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Добавляет нового пользователя, если его еще нет в базе
     * @param user - добавляемый пользователь
     */
    public void addUser(User user) {
        if (users.containsKey(user)) {
            throw new IllegalArgumentException("Пользователь уже существует");
        }
        users.put(user, new ArrayList<>());
    }

    /**
     * Добавляет новый счет пользователю, если его нет в списке счетов
     * @param passport - уникальный идентификатор пользователя
     * @param account - добавляемый счет
     */
    public void addAccount(String passport, Account account) {
        User found = findByPassport(passport);
        if (found == null) {
            throw new IllegalArgumentException("Пользователя не существует");
        }
        List<Account> accounts = users.get(found);
        int index = accounts.indexOf(account);
        if (index != -1) {
            throw new IllegalArgumentException("Такой счет уже существует");
        }
        accounts.add(account);
    }

    /**
     * Находит пользователя по уникальному идентификатору среди списка ключей
     * @param passport - уникальный идентификатор пользователя
     * @return - искомый пользователь / null если не найден
     */
    public User findByPassport(String passport) {
        User found = null;
        for (User user : users.keySet()) {
            if (user.equals(new User(passport, ""))) {
                found = user;
                break;
            }
        }
        return found;
    }

    /**
     * Находит счет пользователя по номеру счета
     * @param passport - уникальный идентификатор пользователя
     * @param requisite - номер искомого счета
     * @return - искомый счет / null если не найден
     */
    public Account findByRequisite(String passport, String requisite) {
        User uFound = findByPassport(passport);
        if (uFound == null) {
            throw new IllegalStateException("Пользователь с таким паспортом не найден");
        }
        List<Account> accounts = users.get(uFound);
        int index = accounts.indexOf(new Account(requisite, -1));
        if (index == -1) {
            throw new IllegalStateException("Счета с таким номером не найдено");
        }
        return accounts.get(index);
    }

    /**
     * Осуществляет операцию денежного перевода с одного счета на другой
     * @param srcPassport - уникальный идентификатор пользователя-отправителя
     * @param srcRequisite - номер счета отправителя
     * @param destPassport - уникальный идентификатор пользователя-получателя
     * @param destRequisite -  номер счета получателя
     * @param amount - переводимая сумма
     * @return true - операция перевода выполнена / false - операция перевода не выполнена
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAcc = findByRequisite(srcPassport, srcRequisite);
        Account destAcc = findByRequisite(destPassport, destRequisite);
        if (srcAcc != null && destAcc != null && srcAcc.getBalance() >= amount) {
            srcAcc.setBalance(srcAcc.getBalance() - amount);
            destAcc.setBalance(destAcc.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}