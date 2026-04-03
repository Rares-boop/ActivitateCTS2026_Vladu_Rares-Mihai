package cts.vladu.raresmihai.g1098.singleton.main;

import cts.vladu.raresmihai.g1098.singleton.model.AbstractMembership;
import cts.vladu.raresmihai.g1098.singleton.model.Membership;

public class Program {
    public static void main(String[] args) {
        System.out.println("hwvcnkej");

        AbstractMembership membership = Membership.getInstance(5, "Membership", 20);
        AbstractMembership membership1 = Membership.getInstance(6, "Alt membership", 50);

        new Thread(()->{
            AbstractMembership membershipPremium = Membership.getInstance(7, "Membership premium ", 20);
            AbstractMembership membershipBun = Membership.getInstance(8, "Membership Bun", 40);

            membershipPremium.afiseazaDetalii();
            membershipBun.afiseazaDetalii();

        }).start();

        membership.afiseazaDetalii();
        membership1.afiseazaDetalii();
    }
}
