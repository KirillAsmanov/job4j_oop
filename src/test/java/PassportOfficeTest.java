import org.junit.Test;
import ru.job4j.oop.collections.passport.Citizen;
import ru.job4j.oop.collections.passport.PassportOffice;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PassportOfficeTest {

    @Test
    public void whenAddIsSuccess() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.get(citizen.getPassport()), is(citizen));
    }

    @Test
    public void whenKeyIsAlreadyExist() {
        Citizen citizen = new Citizen("2f44a", "Petr Arsentev");
        Citizen duplicate = new Citizen("2f44a", "Gemini");
        PassportOffice office = new PassportOffice();
        office.add(citizen);
        assertThat(office.add(duplicate), is(false));
    }

}