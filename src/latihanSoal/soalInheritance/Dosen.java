public class Dosen extends Employee {
    int tunjanganSertifikasi;

    public Dosen(String name, int gajiPokok, int tunjanganSertifikasi) {
        super(name, gajiPokok);
        this.tunjanganSertifikasi = tunjanganSertifikasi;
    }

    @Override
    void tampilkanData() {
        System.out.println("=== DATA DOSEN UTM ===");
        super.tampilkanData();
        System.out.println("Tunjangan    : " + tunjanganSertifikasi);
        System.out.println("Total Terima : Rp " + (gajiPokok + tunjanganSertifikasi));
        System.out.println("-----------------------");
    }
}
