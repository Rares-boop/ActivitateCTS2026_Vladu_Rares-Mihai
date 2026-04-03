package cts.vladu.raresmihai.g1098.builder.main;

import cts.vladu.raresmihai.g1098.builder.model.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        try {
            IMagazin magazin = new MagazinBuilder().setDenumire("Magazin").build();
            IMagazin newMagazin = new MagazinBuilder().setDenumire("Alt magazin").setNrIntrari(5)
                    .setPodea(new Podea(true, 4)).setDecoratiune(new Decoratiune(true, 4))
                    .build();

//            IMagazin magazin1 = new MagazinBuilder().setDenumire("Intrari ").setNrIntrari(3)
//                            .setPodea(new Podea(true, 5)).setSuprafata(500)
//                            .build();
//            IMagazin magazinBun = new MagazinBuilder().setDenumire("Magazin Frumos ")
//                            .setDecoratiune(new Decoratiune(true, 4)).build();

            System.out.println(magazin.calculGradIncendiu());
            System.out.println(newMagazin.calculGradIncendiu());

            System.out.println(magazin);
            System.out.println(newMagazin);


        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
