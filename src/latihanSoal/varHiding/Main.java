public class Main {
    public static void main(String[] args) {
        Hero spider = new Spiderman();
        reveal(spider);
    }

    static void reveal(Hero h) {
        // 1. Cetak identitas awal (ini pasti ambil punya Bapak karena h tipenya Hero)
        System.out.println("=== IDENTITAS AWAL (Tipe Hero) ===");
        System.out.println("Identity : " + h.identity);
        System.out.print("Shout    : ");
        h.shout(); // Ini bakal manggil punya Spiderman (Polymorphism)

        // 2. Cek identitas asli pake Downcasting
        if (h instanceof Spiderman) {
            System.out.println("\n=== IDENTITAS ASLI (Setelah Cast) ===");

            // Kita cast h ke tipe Spiderman supaya kacamata Java berubah
            Spiderman asli = (Spiderman) h;

            // Sekarang panggil variabel identity milik si Anak
            System.out.println("Identity : " + asli.identity);
        }
    }
}
