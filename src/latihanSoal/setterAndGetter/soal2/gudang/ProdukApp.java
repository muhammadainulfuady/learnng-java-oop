package latihanSoal.setterAndGetter.soal2.gudang;

public class ProdukApp extends Produk {
    private int beliBarang;

    public ProdukApp(String name, int stok, int beliBarang) {
        super(name, stok);
    }

    public void setBeliBarang(int beliBarang) {
        if (beliBarang < 0) {
            System.out.println("Barang yang di beli tidak boleh 0");
        } else {
            this.beliBarang = beliBarang;
        }
    }

    public int getBeliBarang() {
        return this.beliBarang;
    }

    @Override
    public void showApp() {
        System.out.println("Anda membeli barang " + getName() + " " + beliBarang);
    }
}
