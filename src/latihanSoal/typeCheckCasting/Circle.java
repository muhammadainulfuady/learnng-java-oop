public class Circle extends Shape {
    Circle(String name) {
        super(name);

    }

    void gambarBundar() {
        System.out.println("Identitas       : " + name);
        System.out.println("Menggambar lingkaran sempurna!!!");
    }
}
