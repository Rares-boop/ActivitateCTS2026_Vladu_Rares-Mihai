package ro.ase.cts.simplefactory.main;

import ro.ase.cts.simplefactory.angajati.PersonalSpital;
import ro.ase.cts.simplefactory.factory.PersonalFactory;
import ro.ase.cts.simplefactory.factory.TipPersonal;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        PersonalFactory personalFactory = new PersonalFactory();

        PersonalSpital brancardier = personalFactory.createInstance(TipPersonal.BRANCARDIER,
                "Personal ", 6000, 40);
        PersonalSpital asistent = personalFactory.createInstance(TipPersonal.ASISTENT,
                "Asistent ", 7000, "sala 1");

        PersonalSpital medic = personalFactory.createInstance(TipPersonal.MEDIC, "Medic ",
                12000, 20);
        PersonalSpital brancardier1 = personalFactory.createInstance(TipPersonal.BRANCARDIER,
                "Alt personal ", 5500, 34);

        System.out.println(brancardier);
        System.out.println(asistent);

        System.out.println(medic);
        System.out.println(brancardier1);
    }
}
