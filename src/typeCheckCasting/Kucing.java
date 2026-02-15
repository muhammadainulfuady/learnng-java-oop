class Kucing extends Hewan {
    Kucing(String nama) {
        super(nama);
    }

    void bersuara() {
        System.out.println(nama + ": Meong!");
    }
}