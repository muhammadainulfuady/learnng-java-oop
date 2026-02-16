package setterAndGetter.main;

import setterAndGetter.perbankan.Rekening;

public class BankApp {
    public static void main(String[] args) {
        Rekening rekening1 = new Rekening("240411100009", 50_000);
        rekening1.setorTunai(20_000);
        rekening1.setorTunai(10_000);
        rekening1.getSaldo();
        rekening1.showBank();
        rekening1.cetakLaporanAkhir();
    }
}
