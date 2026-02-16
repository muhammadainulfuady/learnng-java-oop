package latihanSoal.multi.merchant.data;

public abstract class Merchant {
    public String name;
    public double hargaItem = 10_000;

    public abstract double hitungTotal(int jumlah);
}
