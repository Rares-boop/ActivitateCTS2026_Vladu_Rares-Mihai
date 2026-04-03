package ro.ase.cts.factorymethod.main;

import ro.ase.cts.factorymethod.angajati.IAngajat;
import ro.ase.cts.factorymethod.enums.TipPersonalAuxiliar;
import ro.ase.cts.factorymethod.enums.TipPersonalSpital;
import ro.ase.cts.factorymethod.factory.AbstractAngajatiFactory;
import ro.ase.cts.factorymethod.factory.PersonalAuxiliarFactory;
import ro.ase.cts.factorymethod.factory.PersonalSpitalFactory;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractAngajatiFactory personalSpitalFactory = new PersonalSpitalFactory();
        AbstractAngajatiFactory personalAuxiliarFactory = new PersonalAuxiliarFactory();

        try{
            IAngajat brancardier = personalSpitalFactory.getAngajat(TipPersonalSpital.BRANCARDIER,
                    "Personal ", 6000);
            IAngajat asistent = personalSpitalFactory.getAngajat(TipPersonalSpital.ASISTENT,
                    "Asistent ", 7000);

            IAngajat medic = personalSpitalFactory.getAngajat(TipPersonalSpital.MEDIC,
                    "Medic ", 12000);
            IAngajat brancardier1 = personalSpitalFactory.getAngajat(TipPersonalSpital.BRANCARDIER,
                    "Alt personal ", 5500);

            brancardier.descriere();
            asistent.descriere();

            medic.descriere();
            brancardier1.descriere();

            IAngajat secretar = personalAuxiliarFactory.getAngajat(TipPersonalAuxiliar.SECRETAR,
                    "Secretar ", "contabilitate ");
            IAngajat regisrator = personalAuxiliarFactory.getAngajat(TipPersonalAuxiliar.REGISRATOR,
                    "Regisrator ", "contabilitate");

            secretar.descriere();
            regisrator.descriere();

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
