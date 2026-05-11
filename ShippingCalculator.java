public class ShippingCalculator {

    // Base rate per kg per km
    private static final double BASE_RATE = 0.05;

    // Delivery multipliers
    private static final double STANDARD_MULTIPLIER  = 1.0;
    private static final double EXPRESS_MULTIPLIER   = 1.5;
    private static final double OVERNIGHT_MULTIPLIER = 2.5;

    // Fixed handling charges
    private static final double STANDARD_HANDLING  = 20.0;
    private static final double EXPRESS_HANDLING   = 50.0;
    private static final double OVERNIGHT_HANDLING = 100.0;

    /**
     * Calculates the shipping cost for a given shipment.
     * Formula: (weight * distance * BASE_RATE * multiplier) + handlingCharge
     */
    public double calculateCost(Shipment shipment) {
        double weight   = shipment.getWeight();
        double distance = shipment.getDistance();
        String option   = shipment.getDeliveryOption();

        double multiplier     = STANDARD_MULTIPLIER;
        double handlingCharge = STANDARD_HANDLING;

        switch (option) {
            case "express":
                multiplier     = EXPRESS_MULTIPLIER;
                handlingCharge = EXPRESS_HANDLING;
                break;
            case "overnight":
                multiplier     = OVERNIGHT_MULTIPLIER;
                handlingCharge = OVERNIGHT_HANDLING;
                break;
            case "standard":
            default:
                multiplier     = STANDARD_MULTIPLIER;
                handlingCharge = STANDARD_HANDLING;
                break;
        }

        double cost = (weight * distance * BASE_RATE * multiplier) + handlingCharge;
        return Math.round(cost * 100.0) / 100.0; // round to 2 decimal places
    }

    // Display pricing info
    public void displayPricingInfo() {
        System.out.println("--------------------------------------------");
        System.out.println("         PRICING INFORMATION                ");
        System.out.println("--------------------------------------------");
        System.out.println("  Base Rate       : Rs. 0.05 per kg per km  ");
        System.out.println("  Standard        : 1.0x rate + Rs. 20 handling");
        System.out.println("  Express         : 1.5x rate + Rs. 50 handling");
        System.out.println("  Overnight       : 2.5x rate + Rs.100 handling");
        System.out.println("--------------------------------------------");
    }
}
