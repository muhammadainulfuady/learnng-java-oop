package Sistem_Manajemen_Keanggotaan_Gym.membership;

public class MemberReguler extends Member {
    double administrasi = 10_000;

    public MemberReguler(String name, double biayaDasar) {
        super(name, biayaDasar);
    }

    @Override
    public void hitungTotalTagihan() {
        System.out.println("Total Tagihan            : " + (getBiayaDasar() + administrasi));
        System.out.println("-----------------------------------");
    }
}
