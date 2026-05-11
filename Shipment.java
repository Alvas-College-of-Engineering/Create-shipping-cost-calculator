public class Shipment {
    private String shipmentId;
    private String senderName;
    private String receiverName;
    private double weight;       // in kg
    private double distance;     // in km
    private String deliveryOption; // "standard", "express", "overnight"
    private double shippingCost;

    // Constructor
    public Shipment(String shipmentId, String senderName, String receiverName,
                    double weight, double distance, String deliveryOption) {
        this.shipmentId = shipmentId;
        this.senderName = senderName;
        this.receiverName = receiverName;
        this.weight = weight;
        this.distance = distance;
        this.deliveryOption = deliveryOption.toLowerCase();
        this.shippingCost = 0.0;
    }

    // Getters
    public String getShipmentId()     { return shipmentId; }
    public String getSenderName()     { return senderName; }
    public String getReceiverName()   { return receiverName; }
    public double getWeight()         { return weight; }
    public double getDistance()       { return distance; }
    public String getDeliveryOption() { return deliveryOption; }
    public double getShippingCost()   { return shippingCost; }

    // Setter for shipping cost
    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    // Display shipment details
    public void displayDetails() {
        System.out.println("============================================");
        System.out.println("         SHIPMENT DETAILS                   ");
        System.out.println("============================================");
        System.out.printf("  Shipment ID     : %s%n", shipmentId);
        System.out.printf("  Sender          : %s%n", senderName);
        System.out.printf("  Receiver        : %s%n", receiverName);
        System.out.printf("  Weight          : %.2f kg%n", weight);
        System.out.printf("  Distance        : %.2f km%n", distance);
        System.out.printf("  Delivery Option : %s%n", deliveryOption.toUpperCase());
        System.out.printf("  Total Cost      : Rs. %.2f%n", shippingCost);
        System.out.println("============================================");
    }
}
