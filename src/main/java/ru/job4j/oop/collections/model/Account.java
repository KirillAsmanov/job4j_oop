package ru.job4j.oop.collections.model;
import java.util.Objects;
/**
 * 3. Модели данных и HashSet.[#245016]
 * @author Kirill Asmanov
 * @since 09.04.2020
 * @version 1.0.0;
 */
@SuppressWarnings("CheckStyle")
public class Account {
    private String passport;
    private String username;
    private String deposit;

    public Account(String passport, String username, String deposit) {
        this.passport = passport;
        this.username = username;
        this.deposit = deposit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(passport, account.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "Account{" +
                "passport='" + passport + '\'' +
                ", username='" + username + '\'' +
                ", deposit='" + deposit + '\'' +
                '}';
    }
}
