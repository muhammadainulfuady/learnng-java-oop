public class Ewallet extends Payment {
    double cashback;

    public Ewallet(double originalBill, double cashback) {
        super(originalBill);
        this.cashback = cashback;
    }

    @Override
    void paymentProcess() {
        super.paymentProcess();
        double rumusCashback = 0.05 * originalBill;
        System.out.println("cashback (5%)       : " + cashback);
        System.out.println("Total Bayar         : " + (originalBill - cashback));
    }
}
