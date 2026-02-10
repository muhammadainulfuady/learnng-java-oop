public class RentalApp {
    public static void main(String[] args) {
        var rental1 = new Rental("ASUS", "ROG", 200_000, 1, 3);
        var rental2 = new Rental("Acer", "Swift");

        rental1.displayLaptop();
        rental1.multipLication();

        rental2.displayLaptop();
        rental2.multipLication();
    }
}
