package residence;

import persons.Person;

public class Apartment extends Residence implements RentPaymentAble {
    public Apartment(String adders, int phoneNumber, int money, Person[] people) {
        super(adders, phoneNumber, money, people);
    }

    @Override
    public int rentPay() {
        return 30000;
    }


}
