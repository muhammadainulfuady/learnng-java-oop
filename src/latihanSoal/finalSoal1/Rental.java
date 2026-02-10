public class Rental {
    String brand;
    String type;
    int price;
    int order;
    int rentalPeriod;

    public Rental(String paramBrand, String paramType, int paramPrice, int paramOrder, int paramRentalPeriod) {
        brand = paramBrand;
        type = paramType;
        price = paramPrice;
        order = paramOrder;
        rentalPeriod = paramRentalPeriod;
    }

    public Rental(String paramBrand, String paramType) {
        this(paramBrand, paramType, 50_000, 2, 2);
    }

    public void displayLaptop() {
        if (price > 200_000) {
            System.out.println("\n=== LAPTOP " + order + " (PREMIUM) ===");
        } else {
            System.out.println("\n=== LAPTOP " + order + " (STANDAR) ===");
        }
        System.out.println("Brand           : " + brand);
        System.out.println("Type            : " + type);
        System.out.println("Price           : " + price);
        System.out.println("Rental Period   : " + rentalPeriod + " Days");
        System.out.println("---------------------------------");
    }

    public void multipLication() {
        System.out.println("Total Payment   : " + "Rp " + price * rentalPeriod);
    }
}
