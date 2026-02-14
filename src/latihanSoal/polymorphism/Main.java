public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new ContractEmployees("Andi", "Contract", 5_000_000, 1_000_000),
                new ContractEmployees("Budi", "Contract Employee", 2_000_000, 500_000),
        };
        System.out.println("SLIP GAJI KARYAWAN");
        for (Employee employee : employees) {
            System.err.println("\n----------------------------------------------");
            employee.cetakSlipGaji();
        }
    }
}
