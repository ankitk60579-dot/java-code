import java.util.Scanner;

public class VegetableSellingApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vegetables: ");
        int n = sc.nextInt();

        String[] vegetables = new String[n];
        int[] quantity = new int[n];
        double[] rate = new double[n];

        
        System.out.println("\n Enter Vegetable Details ");

        for (int i = 0; i < n; i++) {
            System.out.print("Enter vegetable name: ");
            vegetables[i] = sc.next();

            System.out.print("Enter quantity: ");
            quantity[i] = sc.nextInt();

            System.out.print("Enter rate per kg: ");
            rate[i] = sc.nextDouble();
        }

        char choice;

        do {
            System.out.println("\n");
            System.out.println("     AVAILABLE VEGETABLES");
            System.out.println(" ");

            for (int i = 0; i < n; i++) {
                System.out.println((i + 1) + ". " + vegetables[i]
                        + " | Quantity: " + quantity[i]
                        + " kg | Rate: Rs." + rate[i] + "/kg");
            }

            double totalBill = 0;

            System.out.print("\nEnter number of items to buy: ");
            int items = sc.nextInt();

            for (int j = 0; j < items; j++) {

                System.out.print("\nEnter vegetable number: ");
                int vegNo = sc.nextInt();

                int index = vegNo - 1;

                if (index < 0 || index >= n) {
                    System.out.println("Invalid vegetable number!");
                    j--;
                    continue;
                }

                System.out.print("Enter quantity to buy: ");
                int buyQty = sc.nextInt();

                if (buyQty <= quantity[index]) {

                    double amount = buyQty * rate[index];

                    totalBill = totalBill + amount;
                    quantity[index] = quantity[index] - buyQty;

                    System.out.println("Added " + vegetables[index]
                            + " = Rs." + amount);

                } else {
                    System.out.println("Sorry! Only "
                            + quantity[index] + " kg "
                            + vegetables[index] + " is available.");

                    j--;
                }
            }

            System.out.println("\n");
            System.out.println("          CUSTOMER BILL");
            System.out.println("");
            System.out.println("Total Bill = Rs." + totalBill);
            System.out.println("");

            System.out.print("\nNext customer? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

       
        System.out.println("\n");
        System.out.println("       REMAINING STOCK");
        System.out.println("");

        for (int i = 0; i < n; i++) {
            System.out.println(vegetables[i]
                    + " : " + quantity[i] + " kg");
        }

        System.out.println("\nThank you for using Vegetable Selling Application!");

        sc.close();
    }
}