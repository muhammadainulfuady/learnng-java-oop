public class Main {
    public static void main(String[] args) {
        System.err.println("=== AUTOMATIC CHECKOUT SYSTEM ===");
        Payment[] payment = {
                new CreditCard(50_000, 2_000),
                new Ewallet(100_000, 5_000),
                new CreditCard(15_000, 2_000),
        };

        int numberOfItearation = 1;
        for (var i : payment) {
            System.out.println("\nProses Payment To-" + numberOfItearation + " :");
            i.paymentProcess();
            ++numberOfItearation;
        }
        System.out.println(
                "\n===========================================\nTOTAL TRANSAKSI BERHASIL DIPROSES: " + payment.length);

    }
}
