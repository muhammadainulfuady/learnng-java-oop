package latihanSoal.soalObject;

public class Mahasiswa {
    /*
     * field merupakan isian yang ada di dalam sebuah class bisa nama, alamat dan
     * juga negara
     */
    String nama;
    String alamat;
    int umur;

    public static void showMahasiwa(Mahasiswa paramMahasiswa) {
        System.out.println("Nama    : " + paramMahasiswa.nama);
        System.out.println("Alamat  : " + paramMahasiswa.alamat);
        System.out.println("Umur    : " + paramMahasiswa.umur);
    }
}
