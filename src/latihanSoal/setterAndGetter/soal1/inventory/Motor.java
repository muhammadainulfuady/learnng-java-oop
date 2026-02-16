package latihanSoal.setterAndGetter.soal1.inventory;

public class Motor extends Kendaraan {
    double sewaHelm = 10_000;

    public Motor(String platNomor, double hargaSewaPerhari) {
        super(platNomor, hargaSewaPerhari);
    }

    @Override
    public double hitungTotalSewa(int hari) {
        System.out.println("Durasi Sewa     : " + hari + " Hari");
        return (hari * this.getHargaSewaPerhari()) + (hari * sewaHelm);
    }
}
