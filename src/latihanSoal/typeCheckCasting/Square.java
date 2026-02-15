public class Square extends Shape {
    Square(String name) {
        super(name);
    }

    void gambarKotak() {
        System.out.println("Identitas       : " + name);
        System.out.println("Menggambar kotak empat sisi!!");
    }
}
