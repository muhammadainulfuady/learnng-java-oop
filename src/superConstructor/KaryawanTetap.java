public class KaryawanTetap extends Employee {
    int pengalaman;

    public KaryawanTetap(String name, String position, String jobSection, int wages, int pengalaman) {
        super(name, position, jobSection, wages);
        this.pengalaman = pengalaman;
    }

    void showKaryawanTetap() {
        super.showKaryawan();
        String check = pengalaman >= 5 ? "Gaji naik" : "Tunggu 5 tahun untuk gaji naik";
        System.out.println("Pengalaman: " + pengalaman + " (" + check + ")");
    }
}
