package Sistem_Manajemen_Keanggotaan_Gym.membership;

public class MemberGold extends Member {
    double diskon = 0.15;

    public MemberGold(String name, double biayaDasar) {
        super(name, biayaDasar);
    }

    @Override
    public void hitungTotalTagihan() {
        double rumus = diskon * getBiayaDasar();
        System.out.println("Diskon                   : " + diskon);
        System.out.println("Total Tagihan            : " + (getBiayaDasar() - rumus));
        System.out.println("-----------------------------------");
    }
}
