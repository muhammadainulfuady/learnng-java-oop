public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        System.out.println("--- LABEL SEBELUM KONVERSI ---");
        System.out.println("Merk : " + mobil.merk);
        System.out.println("--- LABEL SESUDAH KONVERSI ---");

        if (mobil instanceof Kendaraan) {
            Mobil m = (Mobil) mobil;
            System.out.println("Merk : " + m.merk);
        }
    }
}
