package latihanSoal.finalSoal2.main;

import latihanSoal.finalSoal2.karyawan.*;

public class Main {
    public static void main(String[] args) {
        rincianGaji(new Developer());
        rincianGaji(new Manager());
    }

    static void rincianGaji(Employee e) {
        System.out.println("========== RINCIAN GAJI IT ==========");
        if (e instanceof Developer) {
            Developer d = (Developer) e;
            d.name = "Deveoloper";
            System.out.println("Nama posisi         : " + d.name);
            d.allInformation();
        } else if (e instanceof Manager) {
            Manager m = (Manager) e;
            m.name = "Manager";
            System.out.println("Nama posisi         : " + m.name);
            m.allInformation();

        }
        System.out.println("--------------------------------------\n");
    }
}
