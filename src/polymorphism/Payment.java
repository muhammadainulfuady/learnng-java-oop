public class Payment {
    double originalBill;

    public Payment(double originalBill) {
        this.originalBill = originalBill;
    }

    void paymentProcess() {
        System.out.println("Original Bill       : " + originalBill);
    }
}
