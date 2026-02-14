public class BosApp {
    public static void main(String[] args) {
        System.out.println("=== Karyawan Tetap ===");
        KaryawanTetap karyawanTetap = new KaryawanTetap("Andi", "Manager", "IT", 10000000, 2);
        karyawanTetap.showKaryawanTetap();

        System.out.println("\n=== Karyawan Biasa ===");
        Employee karyawan = new Employee("Budi", "Staff", "HR", 5000000);
        karyawan.showKaryawan();
    }
}
