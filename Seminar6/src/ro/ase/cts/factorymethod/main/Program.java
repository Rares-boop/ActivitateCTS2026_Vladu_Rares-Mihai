package ro.ase.cts.factorymethod.main;

import ro.ase.cts.factorymethod.clase.IFelMancare;
import ro.ase.cts.factorymethod.clase.enums.TipDesert;
import ro.ase.cts.factorymethod.clase.enums.TipSupa;
import ro.ase.cts.factorymethod.fabrici.FabricaDesert;
import ro.ase.cts.factorymethod.fabrici.FabricaSupa;

public class Program {
    public static void main(String[] args){

        FabricaSupa fabricaSupa = new FabricaSupa();
        FabricaDesert fabricaDesert = new FabricaDesert();

        IFelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.SUPA_CIUPERCI,
                200,30);
        IFelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.SUPA_LEGUME,
                300,25,200);

        IFelMancare desertPapanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI,
                200,40,400);
        IFelMancare desertClatite = fabricaDesert.getFelMancare(TipDesert.CLATITE,
                200, 40);

        supaCiuperci.descriere();
        supaLegume.descriere();

        desertPapanasi.descriere();
        desertClatite.descriere();
    }
}
