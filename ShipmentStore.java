import java.util.ArrayList;
import java.util.List;

public class ShipmentStore {

    private List<Shipment> shipments;

    public ShipmentStore() {
        this.shipments = new ArrayList<>();
    }

    // Add a shipment to the store
    public void addShipment(Shipment shipment) {
        shipments.add(shipment);
        System.out.println("  Shipment [" + shipment.getShipmentId() + "] stored successfully.");
    }

    // Display all stored shipments
    public void displayAllShipments() {
        if (shipments.isEmpty()) {
            System.out.println("  No shipments stored.");
            return;
        }
        System.out.println("\n============================================");
        System.out.println("       ALL STORED SHIPMENTS                 ");
        System.out.println("============================================");
        for (Shipment s : shipments) {
            s.displayDetails();
        }
    }

    // Get total count
    public int getTotalShipments() {
        return shipments.size();
    }

    // Get total revenue
    public double getTotalRevenue() {
        double total = 0;
        for (Shipment s : shipments) {
            total += s.getShippingCost();
        }
        return total;
    }
}
