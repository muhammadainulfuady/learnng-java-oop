package latihanSoal.multi.merchant.data;

public class TokoBuku extends Merchant {
    public double hargaItem = 50000;

    public TokoBuku() {
        this.name = "Toko Buku";
    }

    @Override
    public double hitungTotal(int jumlah) {
        return (jumlah * hargaItem) + 2500;
    }

}
