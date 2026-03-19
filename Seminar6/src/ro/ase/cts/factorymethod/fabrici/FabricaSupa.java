package ro.ase.cts.factorymethod.fabrici;

import ro.ase.cts.factorymethod.clase.IFelMancare;
import ro.ase.cts.factorymethod.clase.enums.TipMancare;
import ro.ase.cts.factorymethod.clase.enums.TipSupa;
import ro.ase.cts.factorymethod.clase.supe.SupaCiuperci;
import ro.ase.cts.factorymethod.clase.supe.SupaLegume;

public class FabricaSupa implements FabricaAbstracta{

    @Override
    public IFelMancare getFelMancare(TipMancare tipMancare, double gramaj, double pret) {
        switch ((TipSupa) tipMancare) {
            case SUPA_LEGUME:
                return new SupaLegume(gramaj, pret);
            case SUPA_CIUPERCI:
                return new SupaCiuperci(gramaj, pret);
            default:
                throw new IllegalStateException("Unexpected value: " + tipMancare);
        }
    }

    @Override
    public IFelMancare getFelMancare(TipMancare tipMancare, double gramaj, double pret, double calorii) {
        return getFelMancare(tipMancare, gramaj, pret);
    }
}
