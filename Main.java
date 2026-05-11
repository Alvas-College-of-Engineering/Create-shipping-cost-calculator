import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ShippingCalculator calculator = new ShippingCalculator();
        ShipmentStore      store      = new ShipmentStore();
        Scanner            scanner    = new Scanner(System.in);

        System.out.println("============================================");
        System.out.println("    JAVA SHIPPING COST CALCULATOR           ");
        System.out.println("    Student: SWASTHIK MADIVALA              ");
        System.out.println("    ID     : 4AL23CS170                     ");
        System.out.println("============================================");
        calculator.displayPricingInfo();

        boolean running = true;

        while (running) {
            System.out.println("\n---------- MENU ----------");
            System.out.println("  1. Add New Shipment");
            System.out.println("  2. View All Shipments");
            System.out.println("  3. View Summary");
            System.out.println("  4. Exit");
            System.out.print("  Enter choice: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("  Invalid input. Please enter 1-4.");
                continue;
            }

            switch (choice) {
                case 1:
                    addShipment(scanner, calculator, store);
                    break;
                case 2:
                    store.displayAllShipments();
                    break;
                case 3:
                    displaySummary(store);
                    break;
                case 4:
                    System.out.println("\n  Thank you! Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("  Invalid choice. Try again.");
            }
        }

        scanner.close();
    }

    private static void addShipment(Scanner scanner, ShippingCalculator calculator, ShipmentStore store) {
        System.out.println("\n  --- Enter Shipment Details ---");

        System.out.print("  Shipment ID    : ");
        String id = scanner.nextLine().trim();

        System.out.print("  Sender Name    : ");
        String sender = scanner.nextLine().trim();

        System.out.print("  Receiver Name  : ");
        String receiver = scanner.nextLine().trim();

        double weight = 0, distance = 0;
        try {
            System.out.print("  Weight (kg)    : ");
            weight = Double.parseDouble(scanner.nextLine().trim());

            System.out.print("  Distance (km)  : ");
            distance = Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("  Invalid number entered. Shipment not added.");
            return;
        }

        System.out.print("  Delivery Option (standard / express / overnight): ");
        String option = scanner.nextLine().trim().toLowerCase();

        if (!option.equals("standard") && !option.equals("express") && !option.equals("overnight")) {
            System.out.println("  Invalid delivery option. Defaulting to 'standard'.");
            option = "standard";
        }

        // Create shipment and calculate cost
        Shipment shipment = new Shipment(id, sender, receiver, weight, distance, option);
        double cost = calculator.calculateCost(shipment);
        shipment.setShippingCost(cost);

        // Store and display
        store.addShipment(shipment);
        shipment.displayDetails();
    }

    private static void displaySummary(ShipmentStore store) {
        System.out.println("\n============================================");
        System.out.println("              SUMMARY                       ");
        System.out.println("============================================");
        System.out.printf("  Total Shipments : %d%n", store.getTotalShipments());
        System.out.printf("  Total Revenue   : Rs. %.2f%n", store.getTotalRevenue());
        System.out.println("============================================");
    }
}
