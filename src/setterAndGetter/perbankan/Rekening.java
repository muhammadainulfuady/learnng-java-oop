package setterAndGetter.perbankan;

public class Rekening {
    private String nomorRekening;
    private double saldo;

    public Rekening(String nomorRekening, double saldo) {
        this.nomorRekening = nomorRekening;
        if (saldo > 0) {
            this.saldo = saldo;
        }
    }

    public void setSaldo(double saldoBaru) {
        if (saldoBaru < 0) {
            System.out.println("\n--- Transaksi: Input Saldo Negatif ---");
            System.out.println("ERROR: Saldo tidak boleh negatif! Saldo tetap" + this.saldo);
        } else {
            this.saldo = saldoBaru;
        }
    }

    public void setorTunai(double jumlah) {
        System.out.println("\n--- Transaksi: Setor Tunai " + jumlah + " ---");
        setSaldo(this.saldo + jumlah); // Manfaatin setter buat validasi
        System.out.println("Berhasil! Saldo sekarang: " + this.saldo);
    }

    public void showBank() {
        System.out.println("\n=== BANK UTM CENTRAL ===");
        System.out.println("No. Rekening        : " + nomorRekening);
        System.out.println("Saldo Awal          : " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void cetakLaporanAkhir() {
        System.out.println("\n--- Laporan Akhir ---");
        System.out.println("Total Saldo Akhir : " + saldo);
        System.out.println("========================");
    }
}
