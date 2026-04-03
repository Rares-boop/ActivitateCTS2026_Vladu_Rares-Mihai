package ro.ase.cts.factorymethod.model.fabrici;

import ro.ase.cts.factorymethod.model.IFelMancare;
import ro.ase.cts.factorymethod.model.desert.Clatite;
import ro.ase.cts.factorymethod.model.desert.Papanasi;
import ro.ase.cts.factorymethod.model.enums.TipDesert;
import ro.ase.cts.factorymethod.model.enums.TipMancare;

public class FactoryDesert implements FactoryAbstract{

    @Override
    public IFelMancare getFelDeMancare(TipMancare type, double valoare, double pret) {
        switch (type){
            case TipDesert.PAPANASI -> {
                return new Papanasi(valoare, pret);
            }
            case TipDesert.CLATITE -> {
                return new Clatite(valoare, pret);
            }
            default -> throw new RuntimeException("Invalid desert type ");
        }
    }
}
