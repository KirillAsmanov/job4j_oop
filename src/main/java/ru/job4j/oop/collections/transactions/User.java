package ru.job4j.oop.collections.transactions;

import java.util.Objects;
/**
 * 3. Банковские переводы.[#245011]
 * @author Kirill Asmanov
 * @since 09.04.2020
 * @version 1.0.0;
 */
public class User {
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }

    @Override
    public String toString() {
        return "User{" + "passport='" + passport + '\'' + ", username='" + username + '\'' + '}';
    }
}
