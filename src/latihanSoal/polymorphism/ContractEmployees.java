public class ContractEmployees extends Employee {
    double allowance;

    ContractEmployees(String name, String employeeType, double basicSalary, double allowance) {
        super(name, employeeType, basicSalary);
        this.allowance = allowance;
    }

    @Override
    void cetakSlipGaji() {
        super.cetakSlipGaji();
        System.out.println("Tunjangan             : " + allowance);
        System.out.println("TOTAL SEMENTARA       : " + (allowance + basicSalary));
    }
}
