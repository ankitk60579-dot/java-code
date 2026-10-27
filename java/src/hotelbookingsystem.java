import java.util.ArrayList;
import java.util.Scanner;

public class hotelbookingsystem{


    public static void main(String[] args) {
    	System.out.println("How many hotels you want to input?");
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter hotel name");
    	System.out.println("Enter room type");
    	System.out.println("Enter price");
        Scanner sc = new Scanner(System.in);

        ArrayList<Hotel> hotels = new ArrayList<>();

        
        hotels.add(new Hotel(1, "Sarovar", 1, 9000));
        hotels.add(new Hotel(2, "Taj", 1, 12000));
        hotels.add(new Hotel(3, "Global", 3, 18000));
        hotels.add(new Hotel(4, "Royal", 1, 15000));
        hotels.add(new Hotel(5, "Cell", 2, 11000));

      System.out.println("HOTEL BOOKING SYSTEM");
        
 System.out.println("\n1. View Hotel List");
   System.out.println("2. Exit");

        System.out.print("\nEnter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("\nAVAILABLE HOTELS");

            for (Hotel hotel : hotels) {
                hotel.displayHotel();
            }

            System.out.print("Enter Hotel ID to select: ");
            int hotelId = sc.nextInt();

            boolean found = false;

            for (Hotel hotel : hotels) {

                if (hotel.id == hotelId) {
                    System.out.println("\nSELECTED HOTEL DETAILS");
                    hotel.displayHotel();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Hotel not found");
            }

        } else if (choice == 2) {

            System.out.println("Thank you");

        } else {

            System.out.println("Invalid choice");

        }
    }
        	
        }

