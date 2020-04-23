package ru.job4j.oop.lambda.tours;
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

    public class Address {
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

    }

}

