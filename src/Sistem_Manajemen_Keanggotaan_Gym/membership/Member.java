package Sistem_Manajemen_Keanggotaan_Gym.membership;

public abstract class Member {
    private String name;
    private double biayaDasar;

    public Member(String name, double biayaDasar) {
        this.name = name;
        setBiayaDasar(biayaDasar);
    }

    public void setBiayaDasar(double hargaMember) {
        if (biayaDasar < 50_000) {
            this.biayaDasar = 50_000;
        } else {
            this.biayaDasar = hargaMember;
        }
    }

    public double getBiayaDasar() {
        return this.biayaDasar;
    }

    public String getNama() {
        return this.name;
    }

    public abstract void hitungTotalTagihan();

    public void tampilkanProfil() {
        System.out.println("Nama Member   : " + this.getNama());
        System.out.println("Biaya Dasar   : " + this.getBiayaDasar());
    }
}
