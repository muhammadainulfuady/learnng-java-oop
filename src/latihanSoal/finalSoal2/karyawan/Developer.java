package latihanSoal.finalSoal2.karyawan;

public class Developer extends Employee {
    public long gajiPokok = 8_000_000;
    public long bonusProject = 2_000_000;

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
