public class Main {
    public static void main(String[] args) {
        Shape[] shape = {
                new Circle("Lingkaran A"),
                new Square("Kotak B")
        };

        for (Shape i : shape) {
            if (i instanceof Circle) {
                ((Circle) i).gambarBundar();
            } else if (i instanceof Square) {
                ((Square) i).gambarKotak();
            }
            System.out.println("=================================================");
        }
    }
}
