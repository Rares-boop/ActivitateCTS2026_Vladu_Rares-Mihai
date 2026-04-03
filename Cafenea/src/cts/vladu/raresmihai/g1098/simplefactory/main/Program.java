package cts.vladu.raresmihai.g1098.simplefactory.main;

import cts.vladu.raresmihai.g1098.simplefactory.model.simplefactory.*;


public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        BauturaFactory bauturaFactory = new BauturaFactory();

        Bautura cafea = bauturaFactory.createBautura(TipBautura.CAFEA, "Cafea", 200, 20);
        Bautura ceai = bauturaFactory.createBautura(TipBautura.CEAI, "Ceai", 300 , 5);

        Bautura ciocolataCalda = bauturaFactory.createBautura(TipBautura.CIOCOLATA_CALDA, "Ciocolata",
                200, 22);
        Bautura cafea1 = bauturaFactory.createBautura(TipBautura.CAFEA, "Cafea calda",
                250, 16);

        cafea.preparare();
        ceai.preparare();

        ciocolataCalda.preparare();
        cafea1.preparare();

        Bautura ceaiRetinut = ((Ceai)ceai).cloneazaBautura();
        Bautura ciocolataCaldaRetinuta = ((CiocolataCalda)ciocolataCalda).cloneazaBautura();

        ((Ceai)ceaiRetinut).setNume("Ceai negru");
        ((Ceai)ceaiRetinut).setPret(9);

        ((CiocolataCalda)ciocolataCaldaRetinuta).setNume("Ciocolata calda");
        ((CiocolataCalda)ciocolataCaldaRetinuta).setVolum(250);

        ceaiRetinut.preparare();
        ciocolataCaldaRetinuta.preparare();

    }
}
