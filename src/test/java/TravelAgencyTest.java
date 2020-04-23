import org.junit.Test;
import ru.job4j.oop.lambda.tours.Profile;
import ru.job4j.oop.lambda.tours.TravelAgency;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TravelAgencyTest {
    @Test
    public void studentsOfAClass() {
        List<Profile> profileList = new ArrayList<Profile>();
        Profile testP = new Profile();
        testP.setAddress("St.Pb", "Sennaya", 14, 85);
        profileList.add(testP);

        List<Profile.Address> addressesList = TravelAgency.collect(profileList);

        assertThat(addressesList.get(0).getStreet(), is("Sennaya"));
    }
}
