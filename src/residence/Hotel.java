package residence;

import persons.Person;

public class Hotel extends Residence implements UtilityPaymentAble {

    public Hotel(String adders, int phoneNumber, int money, Person[] people) {
        super(adders, phoneNumber, money, people);
    }


    @Override
    public int utilityPay() {
        return 5000;
    }
}
