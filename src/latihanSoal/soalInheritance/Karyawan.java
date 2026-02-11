// class utama
public class Karyawan {
    String name;
    int gajiPokok;

    public Karyawan(String name, int gajiPokok) {
        this.name = name;
        this.gajiPokok = gajiPokok;
    }   

    void tampilkanData() {
        System.out.println("Nama        : " + name);
        System.out.println("Gaji        : " + gajiPokok);
    }
}


