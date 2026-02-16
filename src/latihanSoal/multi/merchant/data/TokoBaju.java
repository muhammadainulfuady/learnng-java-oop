package latihanSoal.multi.merchant.data;

public class TokoBaju extends Merchant {
    public double hargaItem = 15_000;

    public TokoBaju() {
        this.name = "Toko Baju";
    }

    @Override
    public double hitungTotal(int jumlah) {
        return (jumlah * hargaItem) * 1.1;
    }
}
