package residence;

import persons.ApartmentFamily;
import persons.HostelFamily;
import persons.HotelFamily;
import persons.Person;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Person[] apartmentFamily = {
                new ApartmentFamily("Kuban Kelsinbekov","Vostok-5",777897867),
                new ApartmentFamily("Omurbek Tekebaev","Vostok-5",777876557),
                new ApartmentFamily("Omurbek Tekebaev","Vostok-5",777876557),
                new ApartmentFamily("Omurbek Tekebaev","Vostok-5",777876557),
                new ApartmentFamily("Omurbek Tekebaev","Vostok-5",777876557),
        };

        Person[] hostelFamily = {
                new HostelFamily("Adyl Kaparov","Jal",776859403),
                new HostelFamily("Jamylya Daniarova","Jal",776584930),
                new HostelFamily("Jamylya Daniarova","Jal",776584930)
        };

        Person[] hotelFamily = {
                new HotelFamily("Mirbek Atabekov","Asanbai",77683467),
                new HotelFamily("Milana Atabekova","Asanbai",77688767),
                new HotelFamily("Aiana Atabekova","Asanbai",77688767),
                new HotelFamily("Guldana Atabekova","Asanbai",77688767),
                new HotelFamily("Asel Atabekova","Asanbai",77688767),
                new HotelFamily("Janara Atabekova","Asanbai",77688767),
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Available addresses: 'Jal', 'Vostok-5', 'Asanbai'.\n" + "Enter address: ");
        String address = scanner.nextLine();

        Apartment apartment = new Apartment("Vostok-5",777354672,30000,apartmentFamily);
        Hostel hostel = new Hostel("Jal",756849302,2000,hostelFamily);
        Hotel hotel = new Hotel("Asanbai",998768756,5000,hotelFamily);

        if (apartment.getAdders().equals(address)) {
            System.out.println(apartment.toString());
            System.out.println("В семье: " + apartmentFamily.length + " человек живет.");
            for (Person person : apartmentFamily) {
                System.out.print(person);
            }
            System.out.println("За аренду они платят: " + apartment.rentPay() + " сома.");
        } else if (hostel.getAdders().equals(address)) {
            System.out.println(hostel.toString());
            System.out.println("В семье: " + hostelFamily.length + " человек живет.");
            for (Person person : hostelFamily) {
                System.out.print(person);
            }
            System.out.println("За коммуналку они платят: " + hostel.utilityPay() + " сома.");
        } else if (hotel.getAdders().equals(address)) {
            System.out.println(hotel.toString());
            System.out.println("В семье: " + hotelFamily.length + " человек живет.");
            for (Person person : hotelFamily) {
                System.out.print(person);
            }
            System.out.println("За коммуналку они платят: " + hotel.utilityPay() + " сома.");
        }else {
            System.out.println("Error address!!");
        }
    }
}