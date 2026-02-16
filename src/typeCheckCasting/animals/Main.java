package typeCheckCasting.animals;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- PROSES PENGECEKAN ---");
        Animal animal = new Animal();
        Animal dog = new Dog();
        if (animal instanceof Animal) {
            Animal a = (Animal) animal;
            String anjing = "Ini adalah seekor Anjing";
            System.out.println("Type (Versi Bapak)      : " + a.type);
            System.out.println("Status                  : " + anjing);
        } else if (dog instanceof Dog) {
            Animal d = (Dog) dog;
            System.out.println("Type (Versi Bapak)      : " + d.type);
            System.out.println("Suara                   : " + dog.bark());
        }
    }
}
