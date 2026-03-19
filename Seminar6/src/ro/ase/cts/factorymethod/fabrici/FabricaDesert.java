package ro.ase.cts.factorymethod.fabrici;

import ro.ase.cts.factorymethod.clase.IFelMancare;
import ro.ase.cts.factorymethod.clase.desert.Clatite;
import ro.ase.cts.factorymethod.clase.desert.Papanasi;
import ro.ase.cts.factorymethod.clase.enums.TipDesert;
import ro.ase.cts.factorymethod.clase.enums.TipMancare;

public class FabricaDesert implements FabricaAbstracta{

    @Override
    public IFelMancare getFelMancare(TipMancare tipMancare, double gramaj, double pret) {
        return getFelMancare(tipMancare, gramaj, pret, 500);
    }

    @Override
    public IFelMancare getFelMancare(TipMancare tipMancare, double gramaj, double pret, double calorii) {
        switch (tipMancare){
            case TipDesert.PAPANASI:
                return new Papanasi(gramaj, pret, calorii);
            case TipDesert.CLATITE:
                return new Clatite(gramaj, pret, calorii);
            default:
                throw new RuntimeException("Invalid desert type");
        }
    }
}
