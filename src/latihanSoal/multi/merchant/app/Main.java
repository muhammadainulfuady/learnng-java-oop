package latihanSoal.multi.merchant.app;

import latihanSoal.multi.merchant.data.*;

public class Main {
    public static void main(String[] args) {
        cetakStruk(new TokoBaju(), 2);
        cetakStruk(new TokoBuku(), 1);
    }

    static void cetakStruk(Merchant m, int qty) {
        System.out.println("========== STRUK PEMBAYARAN ==========");
        System.out.println("Toko         : " + m.name);
        System.out.println("Qty          : " + qty + " unit");
        if (m instanceof TokoBaju) {
            TokoBaju baju = (TokoBaju) m;
            System.out.println("Harga Asli   : " + baju.hargaItem + " (Toko Price)");
            System.out.println("TOTAL BAYAR  : " + m.hitungTotal(qty) + " (Termasuk Pajak 10%)");
        } else if (m instanceof TokoBuku) {
            TokoBuku buku = (TokoBuku) m;
            System.out.println("Harga Asli   : " + buku.hargaItem + " (Toko Price)");
            System.out.println("TOTAL BAYAR  : " + m.hitungTotal(qty) + " (Termasuk Pajak Flat)");
        }
        System.out.println("--------------------------------------\n");
    }
}
