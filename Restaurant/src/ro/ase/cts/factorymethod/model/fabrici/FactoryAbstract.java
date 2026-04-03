package ro.ase.cts.factorymethod.model.fabrici;

import ro.ase.cts.factorymethod.model.IFelMancare;
import ro.ase.cts.factorymethod.model.enums.TipMancare;

public interface FactoryAbstract {
    IFelMancare getFelDeMancare(TipMancare type, double valoare, double pret);
}
