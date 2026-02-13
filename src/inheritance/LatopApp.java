package inheritance;

public class LatopApp {
    public static void main(String[] args) {
        var laptop = new Laptop();
        laptop.name = "Budi";
        laptop.tampilkanLaptop("Biasa");

        var laptopGaming = new LaptopGaming();
        laptopGaming.name = "Adi";
        laptopGaming.tampilkanLaptop("Gaming");
    }
}
