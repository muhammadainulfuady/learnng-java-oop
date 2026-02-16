package Sistem_Manajemen_Keanggotaan_Gym.app;

import Sistem_Manajemen_Keanggotaan_Gym.membership.*;

public class GymApp {
    public static void main(String[] args) {
        // reguler
        System.out.println("=== GYM FITNESS MADURA ===");
        Member member1 = new MemberReguler("Fuady", 50_000);
        member1.tampilkanProfil();
        member1.hitungTotalTagihan();

        // gold
        Member member2 = new MemberGold("Ainul", 180_000);
        member2.tampilkanProfil();
        member2.hitungTotalTagihan();
    }
}
