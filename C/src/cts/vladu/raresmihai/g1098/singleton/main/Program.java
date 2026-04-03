package cts.vladu.raresmihai.g1098.singleton.main;

import cts.vladu.raresmihai.g1098.singleton.model.AbstractMembership;
import cts.vladu.raresmihai.g1098.singleton.model.Membership;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractMembership membership = Membership.getInstance();
        AbstractMembership newMembership = Membership.getInstance();

        new Thread(()->{

            AbstractMembership membershipBun = Membership.getInstance();
            AbstractMembership membership1 = Membership.getInstance();

            membershipBun.afiseazaDetalii();
            membership1.afiseazaDetalii();

        }).start();

        membership.afiseazaDetalii();
        newMembership.afiseazaDetalii();

    }
}
