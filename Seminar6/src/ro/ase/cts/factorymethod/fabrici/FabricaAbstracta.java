package ro.ase.cts.factorymethod.fabrici;

import ro.ase.cts.factorymethod.clase.IFelMancare;
import ro.ase.cts.factorymethod.clase.enums.TipMancare;

public interface FabricaAbstracta {
    IFelMancare getFelMancare(TipMancare tipMancare, double gramaj, double pret);
    IFelMancare getFelMancare(TipMancare tipMancare, double gramaj, double pret,
                              double calorii);
}
