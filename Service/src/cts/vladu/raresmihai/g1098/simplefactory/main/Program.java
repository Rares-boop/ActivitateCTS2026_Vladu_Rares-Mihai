package cts.vladu.raresmihai.g1098.simplefactory.main;

import cts.vladu.raresmihai.g1098.simplefactory.model.AMasina;
import cts.vladu.raresmihai.g1098.simplefactory.model.MasinaFactory;
import cts.vladu.raresmihai.g1098.simplefactory.model.TipMasina;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        try {
            AMasina suv = MasinaFactory.createInstance(TipMasina.SUV, "Ford", 4, 2.2);
            AMasina van = MasinaFactory.createInstance(TipMasina.VAN, "Mercedes", 4, 2.7);

            AMasina sedan = MasinaFactory.createInstance(TipMasina.SEDAN, "Ford", 8, 2.7);
            AMasina suv1 = MasinaFactory.createInstance(TipMasina.SUV, "Mercedes", 4, 2.5);

            //AMasina masina = MasinaBuilder.createInstance(TipMasina.MASINA, "Masina", 4, 2.2);

            System.out.println(suv);
            System.out.println(van);

            System.out.println(sedan);
            System.out.println(suv1);


        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
