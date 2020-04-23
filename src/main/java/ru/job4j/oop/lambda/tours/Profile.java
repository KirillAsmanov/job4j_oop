package ru.job4j.oop.lambda.tours;

import java.util.Objects;

/**
 * 2. Список адресов [#244874]
 * Модель данных профиля клиента
 * @author Kirill Asmanov
 * @since 23.04.2020
 * @version 1.0.0;
 */
public class Profile {
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(String city, String street, int home, int apartment) {
        this.address = new Address(city, street, home, apartment);
    }

    public class Address implements Comparable<Address> {
        private String city;
        private String street;
        private int home;
        private int apartment;

        public Address(String city, String street, int home, int apartment) {
            this.city = city;
            this.street = street;
            this.home = home;
            this.apartment = apartment;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Address address = (Address) o;
            return apartment == address.apartment
                    && home == address.home
                    && Objects.equals(city, address.city)
                    && Objects.equals(street, address.street);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, street, home, apartment);
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getHome() {
            return home;
        }

        public void setHome(int home) {
            this.home = home;
        }

        public int getApartment() {
            return apartment;
        }

        public void setApartment(int apartment) {
            this.apartment = apartment;
        }

        @Override
        public int compareTo(Address o) {
            return Integer.compare(this.home, o.home);
        }
    }

}

