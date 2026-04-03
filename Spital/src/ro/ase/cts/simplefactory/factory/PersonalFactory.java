package ro.ase.cts.simplefactory.factory;

import ro.ase.cts.simplefactory.angajati.Asistent;
import ro.ase.cts.simplefactory.angajati.Brancardier;
import ro.ase.cts.simplefactory.angajati.Medic;
import ro.ase.cts.simplefactory.angajati.PersonalSpital;

public class PersonalFactory {
    public PersonalSpital createInstance(TipPersonal type, String nume,
                                         double salariu, int varsta) {
        switch (type) {
            case BRANCARDIER -> {
                return new Brancardier(nume, salariu, varsta);
            }
            case ASISTENT -> {
                return new Asistent(nume, salariu, "sala default");
            }
            case MEDIC -> {
                return new Medic(nume, salariu, 10);
            }
            default -> {
                throw new RuntimeException("Invalid Personal type");
            }
        }
    }

    public PersonalSpital createInstance(TipPersonal type, String nume,
                                         double salariu, String sala) {
        switch (type) {
            case BRANCARDIER -> {
                return new Brancardier(nume, salariu, 35);
            }
            case ASISTENT -> {
                return new Asistent(nume, salariu, sala);
            }
            case MEDIC -> {
                return new Medic(nume, salariu, 10);
            }
            default -> {
                throw new RuntimeException("Invalid Personal type");
            }
        }
    }

    public PersonalSpital createInstance(TipPersonal type, String nume,
        double salariu, double oreSuplimentare){
        switch (type) {
            case BRANCARDIER -> {
                return new Brancardier(nume, salariu, 35);
            }
            case ASISTENT -> {
                return new Asistent(nume, salariu, "sala default");
            }
            case MEDIC -> {
                return new Medic(nume, salariu, oreSuplimentare);
            }
            default -> {
                throw new RuntimeException("Invalid Personal type");
            }
        }
    }
}
