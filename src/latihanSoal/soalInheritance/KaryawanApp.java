public class KaryawanApp {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen dosen1 = new Dosen("Pak Bambang (Data Mining)", 5000000, 2000000);

        // Memanggil method yang sudah di-override
        dosen1.tampilkanData();
    }
}