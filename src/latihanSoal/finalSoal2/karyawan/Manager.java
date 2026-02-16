package latihanSoal.finalSoal2.karyawan;

public class Manager extends Employee {
    public double gajiPokok = 12_000_000;
    public double bonusProject = 5_000_000;

    public void allInformation() {
        super.gajiStandart();
        System.out.println("Gaji Jabatan        : " + gajiPokok + " " + super.name);
        System.out.println("Total Terima        : " + hitungGajiTotal());
    }

    @Override
    public double hitungGajiTotal() {
        return (gajiPokok + bonusProject);
    }
}
