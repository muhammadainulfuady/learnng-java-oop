public class Interns extends Employee {
    double transportationMoney;

    Interns(String name, String employeeType, double basicSalary, double transportationMoney) {
        super(name, employeeType, basicSalary);
        this.transportationMoney = transportationMoney;
    }

    @Override
    void cetakSlipGaji() {
        super.cetakSlipGaji();
        System.out.println("Trasportation Money   : " + transportationMoney);
        System.out.println("TOTAL SEMENTARA       : " + (transportationMoney + basicSalary));
    }
}
