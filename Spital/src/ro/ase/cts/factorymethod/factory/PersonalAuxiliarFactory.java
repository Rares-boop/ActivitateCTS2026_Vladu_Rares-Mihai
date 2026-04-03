package ro.ase.cts.factorymethod.factory;

import ro.ase.cts.factorymethod.angajati.IAngajat;
import ro.ase.cts.factorymethod.angajati.personalauxiliar.Regisrator;
import ro.ase.cts.factorymethod.angajati.personalauxiliar.Secretar;
import ro.ase.cts.factorymethod.enums.TipAngajat;
import ro.ase.cts.factorymethod.enums.TipPersonalAuxiliar;

public class PersonalAuxiliarFactory implements AbstractAngajatiFactory{

    @Override
    public IAngajat getAngajat(TipAngajat type, String nume, double salariu) {
        return getAngajat(type, nume, "contabilitate");
    }

    @Override
    public IAngajat getAngajat(TipAngajat type, String nume, String domeniu) {
        switch (type){
            case TipPersonalAuxiliar.SECRETAR -> {
                return new Secretar(nume, domeniu);
            }
            case TipPersonalAuxiliar.REGISRATOR -> {
                return new Regisrator(nume, domeniu);
            }
            default -> {
                throw new RuntimeException("Invalid Personal auxiliar type");
            }
        }
    }
}
