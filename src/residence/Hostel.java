package residence;

import persons.Person;

public class Hostel extends Residence implements UtilityPaymentAble {
    public Hostel(String adders, int phoneNumber, int money, Person[] people) {
        super(adders, phoneNumber, money, people);
    }

    @Override
    public int utilityPay() {
        return 2000;
    }
}
