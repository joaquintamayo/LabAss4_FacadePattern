import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk fd = new FrontDesk(); 

        Scanner s = new Scanner(System.in); 
        boolean performing = true; 

        System.out.println("HOTEL MANAGEMENT SYSTEM");

        while (performing) {
            System.out.println("\nREQUEST AND PERFORM SERVICE:");
            System.out.println("1. Valet \n2. Housekeeping \n3. Request Luggage Cart \n4. All Services \n5. Exit");
            System.out.print("\nSelect a Service to Perform: ");
            int service = s.nextInt();

            s.nextLine();

            switch (service) {
                case 1:
                    System.out.print("\nEnter Vehicle Plate Number: ");
                    String plateNumber = s.nextLine();
                    fd.valetService(plateNumber);
                    break;
                case 2:
                    System.out.print("\nEnter Room Number: ");
                    int roomNumber = s.nextInt();
                    fd.hkService(roomNumber);
                    break;
                case 3:
                    System.out.print("\nEnter Quantity of Carts: ");
                    int numberOfCarts = s.nextInt();
                    fd.cartService(numberOfCarts);
                    break;
                case 4:
                    System.out.print("\nEnter Vehicle Plate Number: ");
                    plateNumber = s.nextLine();
                    System.out.print("Enter Room Number: ");
                    roomNumber = s.nextInt();
                    System.out.print("Enter Quantity of Carts: ");
                    numberOfCarts = s.nextInt();
                    fd.allServices(plateNumber, roomNumber, numberOfCarts);
                    break;
                case 5:
                    System.out.println("\nHotel Management System Exited");
                    performing = false;
                    break;
                default:
                    System.out.println("\nNo Service Found. Please try again.");
            }
        }

        s.close();
    }
}