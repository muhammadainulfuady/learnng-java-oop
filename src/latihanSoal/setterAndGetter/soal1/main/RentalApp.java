package latihanSoal.setterAndGetter.soal1.main;

import latihanSoal.setterAndGetter.soal1.inventory.*;

public class RentalApp {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil("Mobil (L 1234 AB)", 3_000_000);
        mobil.showKendaran();
        System.out.println("Total biaya : " + mobil.hitungTotalSewa(3));
        Kendaraan motor = new Motor("Motor (M 5678 CD)", 50_000);
        motor.showKendaran();
        System.out.println("Total biaya : " + motor.hitungTotalSewa(3));
    }
}
