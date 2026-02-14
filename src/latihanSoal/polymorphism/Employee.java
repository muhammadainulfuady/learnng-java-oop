class Employee {
    String name;
    String employeeType;;
    double basicSalary;

    public Employee(String name, String employeeType, double basicSalary) {
        this.name = name;
        this.employeeType = employeeType;
        this.basicSalary = basicSalary; 
    }

    void cetakSlipGaji() {
        System.out.println("Employee              : " + name + "(" + employeeType + ")");
        System.out.println("Basic Salary          : " + basicSalary);
    }
}