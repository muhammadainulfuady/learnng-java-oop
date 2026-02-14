public class CreditCard extends Payment {
    double adminFees;

    public CreditCard(double originalBill, double adminFees) {
        super(originalBill);
        this.adminFees = adminFees;
    }

    @Override
    void paymentProcess() {
        super.paymentProcess();
        System.err.println("Admin Fees          : " + (adminFees));
        System.err.println("Total Payment       : " + (originalBill + adminFees));
    }
}
