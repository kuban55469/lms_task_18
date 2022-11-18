package residence;

import persons.Person;

public abstract class Residence {
    private String adders;
    private int phoneNumber;
    private int money;
    private Person[] people;

    public Residence(String adders, int phoneNumber, int money, Person[] people) {
        this.adders = adders;
        this.phoneNumber = phoneNumber;
        this.money = money;
        this.people = people;
    }

    public String getAdders() {
        return adders;
    }

    public void setAdders(String adders) {
        this.adders = adders;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Residence: " +
                " Adders: " + adders +
                ", Phone Number: " + phoneNumber +
                ", Money: " + money;
    }
}
