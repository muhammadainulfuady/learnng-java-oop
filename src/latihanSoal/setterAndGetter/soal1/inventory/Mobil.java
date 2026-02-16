package latihanSoal.setterAndGetter.soal1.inventory;

public class Mobil extends Kendaraan {
    public double asuransi = 50_0000;

    public Mobil(String platNomor, double hargaSewaPerhari) {
        super(platNomor, hargaSewaPerhari);
    }

    @Override
    public double hitungTotalSewa(int hari) {
        System.out.println("Durasi Sewa     : " + hari + " Hari");
        return ((hari * super.getHargaSewaPerhari()) + asuransi);
    }
}
