package constructor;

public class ConstructorApp {
    public static void main(String[] args) {
        var cs1 = new Constructor("Muhammad Ainul Fuady", "Teknik Informatika", "Indonesia, Jakarta");
        var cs2 = new Constructor("William The Loser", "Teknik Elektro", "Amerika Serikat, New York");
        var cs3 = new Constructor("Budi Santoso", "Teknik Mesin");
        var cs4 = new Constructor("Ilham Kurniawan");
        cs1.biodata();
        cs1.showData();

        cs2.biodata();
        cs2.showData();

        cs3.biodata();
        cs3.showData();

        cs4.biodata();
        cs4.showData();
    }
}
