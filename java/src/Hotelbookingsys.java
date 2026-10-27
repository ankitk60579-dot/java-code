
import java.util.ArrayList;
import java.util.Scanner;

class Hotel {
    int id;
    String name;
    int roomType;
    double price;

    Hotel(int id, String name, int roomType, double price) {
        this.id = id;
        this.name = name;
        this.roomType = roomType;
        this.price = price;
    }

    void displayHotel() {
        System.out.println("Hotel ID:"+ id);
        System.out.println("Hotel Name:"+ name);
        System.out.println("Room Type:"+ roomType);
        System.out.println("Price:"+ price);
        System.out.println("");
    }
}

