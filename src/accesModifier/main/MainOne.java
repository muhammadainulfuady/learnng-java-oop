package accesModifier.main;

import accesModifier.application.Main;
import accesModifier.data.Barang;

public class MainOne {
    public static void main(String[] args) {
        Main createCetakan1 = new Main();
        Barang barang1 = createCetakan1.createCetakan();
        barang1.info();
    }
}
