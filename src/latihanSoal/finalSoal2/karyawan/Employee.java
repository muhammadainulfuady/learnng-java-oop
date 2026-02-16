package latihanSoal.finalSoal2.karyawan;

public abstract class Employee {
    public String name;
    public double gajiPokok = 5_000_000;

    public void gajiStandart() {
        System.out.println("Gaji Standart       : " + gajiPokok + " (Base Employee)");
    }

    public abstract double hitungGajiTotal();
}
