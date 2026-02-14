public class Karyawan {
    String name;
    String position;
    String jobSection;
    int wages;

    public Karyawan(String name, String position, String jobSection, int wages) {
        this.name = name;
        this.position = position;
        this.jobSection = jobSection;
        this.wages = wages;
    }

    void showKaryawan() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Job Section: " + jobSection);
        System.out.println("Wages: " + wages);
    }
}
