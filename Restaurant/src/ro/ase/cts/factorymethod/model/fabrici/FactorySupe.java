package ro.ase.cts.factorymethod.model.fabrici;

import ro.ase.cts.factorymethod.model.IFelMancare;
import ro.ase.cts.factorymethod.model.enums.TipMancare;
import ro.ase.cts.factorymethod.model.enums.TipSupa;
import ro.ase.cts.factorymethod.model.supe.SupaLegume;
import ro.ase.cts.factorymethod.model.supe.SupaVita;

public class FactorySupe implements FactoryAbstract{

    @Override
    public IFelMancare getFelDeMancare(TipMancare type, double valoare, double pret) {
        switch (type){
            case TipSupa.SUPA_CIUPERCI -> {
                return new SupaLegume(valoare, pret);
            }
            case TipSupa.SUPA_VITA -> {
                return new SupaVita(valoare, pret);
            }
            default -> throw new RuntimeException("Invalid supa type ");
        }
    }
}
