import org.junit.Test;
import ru.job4j.oop.lambda.tours.Profile;
import ru.job4j.oop.lambda.tours.TravelAgency;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TravelAgencyTest {
    @Test
    public void whenExtractAddresses() {
        List<Profile> profileList = new ArrayList<Profile>();
        Profile testP = new Profile();
        testP.setAddress("St.Pb", "Sennaya", 14, 85);
        profileList.add(testP);

        List<Profile.Address> addressesList = TravelAgency.collect(profileList);

        assertThat(addressesList.get(0).getStreet(), is("Sennaya"));
    }

    @Test
    public void whenExtractUniqueAddressesAndSort() {
        List<Profile> profileList = new ArrayList<Profile>();
        Profile prof1 = new Profile();
        Profile prof2 = new Profile();
        Profile prof3 = new Profile();
        prof1.setAddress("St.Pb", "Sennaya", 14, 85);
        prof2.setAddress("St.Pb", "Sennaya", 14, 85);
        prof3.setAddress("St.Pb", "Technologicheskaya", 18, 12);
        profileList.add(prof1);
        profileList.add(prof2);
        profileList.add(prof3);

        List<Profile.Address> addressesList = TravelAgency.uniqueSort(profileList);

        assertThat(addressesList.get(1).getStreet(), is("Technologicheskaya"));
    }
}
