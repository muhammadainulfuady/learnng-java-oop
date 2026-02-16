package accesModifier.application;

import accesModifier.data.Barang;

public class Main {
    public Barang createCetakan() {
        Barang b = new Barang();
        b.name = "Laptop Asus";
        b.stok = 15;
        return b;
    }
}
