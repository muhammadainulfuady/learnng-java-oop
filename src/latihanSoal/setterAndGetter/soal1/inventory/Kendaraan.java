package latihanSoal.setterAndGetter.soal1.inventory;

public abstract class Kendaraan {
    private String platNomor;
    private double hargaSewaPerhari;

    public Kendaraan(String platNomor, double hargaSewaPerhari) {
        this.platNomor = platNomor;
        setHarga(hargaSewaPerhari);
    }

    public void setHarga(double harga) {
        if (harga <= 0) {
            System.out.println("Harga sewa nggak boleh 0 atau minus");
        } else {
            this.hargaSewaPerhari = harga;
        }
    }

    public double getHargaSewaPerhari() {
        return this.hargaSewaPerhari;
    }

    public abstract double hitungTotalSewa(int hari);

    public void showKendaran() {
        System.out.println("Kendaraan            : " + platNomor);
        System.out.println("Harga Sewa Perhari   : " + hargaSewaPerhari);
    }
}
