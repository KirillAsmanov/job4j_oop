import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import ru.job4j.oop.collections.transactions.Account;
import ru.job4j.oop.collections.transactions.BankService;
import ru.job4j.oop.collections.transactions.User;

import java.util.NoSuchElementException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BankServiceTest {
    static BankService bank = new BankService();
    @BeforeClass
    public static void init() {
        User user = new User("3434", "Petr Arsentev");
        bank.addUser(user);
    }

    @Test
    public void addUser() {
        User result = bank.findByPassport("3434").get();
        User expected = new User("3434", "");
        assertThat(result, is(expected));
    }

    @Test (expected = NoSuchElementException.class)
    public void whenEnterInvalidPassport() {
        bank.addAccount("00000000000", new Account("0000000", 150D));
    }

    @Test
    public void addAccount() {
        bank.addAccount("3434", new Account("1111", 150D));
        double result = bank.findByRequisite("3434", "1111").get().getBalance();
        assertThat(result, is(150D));
    }

    @Test
    public void transferMoney() {
        bank.addAccount("3434", new Account("2222", 150D));
        bank.addAccount("3434", new Account("3333", 50D));
        bank.transferMoney("3434", "2222", "3434", "3333", 150D);
        double result = bank.findByRequisite("3434", "3333").get().getBalance();
        assertThat(result, is(200D));
    }
}