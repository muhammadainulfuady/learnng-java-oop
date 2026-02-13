public class VehicleApp {
    public static void main(String[] args) {
        var genaralTruk1 = new PublicTransport("Grand Max City", 500, "Siap Jaalan");
        var genaralTruk2 = new PublicTransport("Blind Van", 0, "Standby");
        var genaralTruk3 = new SpecificVehicle("Isuzu Cold Storage", 2000,
                "Sistem Pendingin Aktif - Siap Kirim Frozen Food", -18);
        System.out.println("=== DAFTAR ARMADA BARU ===");
        genaralTruk1.displaysTheVehicle();
        genaralTruk2.displaysTheVehicle();
        genaralTruk3.displaysTheVehicle();
        System.out.println("==========================");
    }
}
