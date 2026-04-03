package ro.ase.cts.factorymethod.factory;

import ro.ase.cts.factorymethod.angajati.IAngajat;
import ro.ase.cts.factorymethod.angajati.personalspital.Asistent;
import ro.ase.cts.factorymethod.angajati.personalspital.Brancardier;
import ro.ase.cts.factorymethod.angajati.personalspital.Medic;
import ro.ase.cts.factorymethod.enums.TipAngajat;
import ro.ase.cts.factorymethod.enums.TipPersonalSpital;

public class PersonalSpitalFactory implements AbstractAngajatiFactory{

    @Override
    public IAngajat getAngajat(TipAngajat type, String nume, double salariu) {
        switch (type){
            case TipPersonalSpital.BRANCARDIER -> {
                return new Brancardier(nume, salariu);
            }
            case TipPersonalSpital.ASISTENT -> {
                return new Asistent(nume, salariu);
            }
            case TipPersonalSpital.MEDIC -> {
                return new Medic(nume, salariu);
            }
            default -> {
                throw new RuntimeException("Invalid Personal spital type");
            }
        }
    }

    @Override
    public IAngajat getAngajat(TipAngajat type, String nume, String domeniu) {
        return getAngajat(type, nume, 8000);
    }
}
