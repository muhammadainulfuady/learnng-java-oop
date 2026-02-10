package latihanSoal.soalObject;

public class Mahasiswa {
    /*
     * field merupakan isian yang ada di dalam sebuah class bisa nama, alamat dan
     * juga negara
     */
    String nama;
    String alamat;
    int umur;

    public static void showMahasiwa(Mahasiswa mhs) {
        System.out.println("Nama    : " + mhs.nama);
        System.out.println("Alamat  : " + mhs.alamat);
        System.out.println("Umur    : " + mhs.umur);
    }
}
