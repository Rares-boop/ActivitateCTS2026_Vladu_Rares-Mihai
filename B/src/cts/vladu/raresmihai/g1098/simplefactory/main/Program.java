package cts.vladu.raresmihai.g1098.simplefactory.main;

import cts.vladu.raresmihai.g1098.simplefactory.model.IPersonal;
import cts.vladu.raresmihai.g1098.simplefactory.model.PersonalFactory;
import cts.vladu.raresmihai.g1098.simplefactory.model.TipPersonal;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        try {
            IPersonal medic = PersonalFactory.createPersonal(TipPersonal.MEDIC, "Medic", "bun");
            IPersonal asistent = PersonalFactory.createPersonal(TipPersonal.ASISTENT, "Asistent", 10000);

            IPersonal secretar = PersonalFactory.createPersonal(TipPersonal.SECRETAR, "Secretar", "acasa");
            IPersonal medic1 = PersonalFactory.createPersonal(TipPersonal.MEDIC, "Alt medic", "bun");

            medic.afiseazaDetalii();
            asistent.afiseazaDetalii();

            secretar.afiseazaDetalii();
            medic1.afiseazaDetalii();

        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
