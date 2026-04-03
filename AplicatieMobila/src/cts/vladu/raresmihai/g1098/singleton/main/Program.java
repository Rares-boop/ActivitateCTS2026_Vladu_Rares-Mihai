package cts.vladu.raresmihai.g1098.singleton.main;

import cts.vladu.raresmihai.g1098.singleton.model.Membership;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Membership membership = Membership.getInstance("Standard", 20);
        Membership membership1 = Membership.getInstance("Premium", 30);

        new Thread(()->{
            Membership membershipReclame = Membership.getInstance("Reclame", 15);
            Membership membershipUltra = Membership.getInstance("Ultra", 40);

            System.out.println(membershipReclame);
            System.out.println(membershipUltra);

        }).start();

        System.out.println(membership);
        System.out.println(membership1);
    }
}
