package ro.ase.cts.factorymethod.factory;

import ro.ase.cts.factorymethod.angajati.IAngajat;
import ro.ase.cts.factorymethod.enums.TipAngajat;

public interface AbstractAngajatiFactory {
    IAngajat getAngajat(TipAngajat type, String nume, double salariu);
    IAngajat getAngajat(TipAngajat type, String nume, String domeniu);
}
