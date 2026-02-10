package latihanSoal.soalObject;

public class MahasiswaApp {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        System.out.println("=== DATA MAHASISWA 1 ===");
        mhs1.nama = "Ainul Fuady";
        mhs1.alamat = "Indonesia";
        mhs1.umur = 19;
        Mahasiswa.showMahasiwa(mhs1);
        System.out.println("\n=== DATA MAHASISWA 2 ===");
        mhs2.nama = "Budi";
        mhs2.alamat = "Jakarta";
        mhs2.umur = 22;
        Mahasiswa.showMahasiwa(mhs2);
    }
}
