package accesModifier.data;

public class Barang {
    public String name;
    public int stok;

    public void info() {
        System.out.println("--- LAPORAN STOK GUDANG ---");
        System.out.println("Nama produk     : " + name);
        System.out.println("Jumlah Stok     : " + stok);
        if (stok != 0) {
            System.out.println("Status    : Tersedia");
        } else {
            System.out.println("Status    : Barang Kosong");
        }
        System.out.println("---------------------------");
    }
}