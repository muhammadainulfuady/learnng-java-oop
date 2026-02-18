package latihanSoal.setterAndGetter.soal2.gudang;

public class Produk {
    private String name;
    private int stok;

    public Produk(String name, int stok) {
        this.name = name;
        setStok(stok);
    }

    public void setStok(int stok) {
        if (stok < 0) {
            System.out.println("\nStok harus lebih dari 0 yah");
        } else {
            this.stok = stok;
        }
    }

    public void beliBarang(int barang) {
        if (barang > this.stok) {
            System.out.println("Maaf stok cuman " + stok);
        } else {
            int stokBaru = getStok() - barang;
            setStok(stokBaru);
        }
    }

    public String getName() {
        return this.name;
    }

    public int getStok() {
        return this.stok;
    }

    public void showApp() {
        System.out.println("\nBarang yang tersedia  : " + name);
        System.out.println("Stok barang             : " + stok);
    }
}
