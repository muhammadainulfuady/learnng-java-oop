public class ZooKeeper {
    public static void main(String[] args) {
        // Polymorphism: Nyimpen Anak di variabel Bapak
        Hewan peliharaan1 = new Kucing("Moci");
        Hewan peliharaan2 = new Anjing("Rex");

        cekHewan(peliharaan1);
        cekHewan(peliharaan2);
    }

    static void cekHewan(Hewan h) {
        System.out.println("Memeriksa " + h.nama + "...");

        // TYPE CHECK: Nanya identitas asli
        if (h instanceof Kucing) {
            // DOWNCASTING: Maksa jadi Kucing biar bisa 'bersuara'
            Kucing k = (Kucing) h;
            k.bersuara();
        } else if (h instanceof Anjing) {
            // DOWNCASTING: Maksa jadi Anjing biar bisa 'gukguk'
            Anjing a = (Anjing) h;
            a.gukguk();
        }
        System.out.println("--------------------");
    }
}