package persons;

public abstract class Person {
    private String fullName;
    private String address;
    private int phoneNumber;

    public Person(String fullName, String address, int phoneNumber) {
        this.fullName = fullName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person: " +
                " Full Name: " + fullName +
                ", Address: " + address +
                ", Phone Number: " + phoneNumber + "\n";
    }
}
