package ro.ase.cts.factorymethod.main;

import ro.ase.cts.factorymethod.model.IFelMancare;
import ro.ase.cts.factorymethod.model.enums.TipDesert;
import ro.ase.cts.factorymethod.model.enums.TipSupa;
import ro.ase.cts.factorymethod.model.fabrici.FactoryAbstract;
import ro.ase.cts.factorymethod.model.fabrici.FactoryDesert;
import ro.ase.cts.factorymethod.model.fabrici.FactorySupe;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        try{
            FactoryAbstract fabricaSupe = new FactorySupe();
            FactoryAbstract fabricaDesert = new FactoryDesert();

            IFelMancare supaLegume = fabricaSupe.getFelDeMancare(TipSupa.SUPA_CIUPERCI, 200, 20);
            IFelMancare supaVita = fabricaSupe.getFelDeMancare(TipSupa.SUPA_VITA, 300, 33);

            IFelMancare papanasi = fabricaDesert.getFelDeMancare(TipDesert.PAPANASI, 400, 25);
            IFelMancare clatite = fabricaDesert.getFelDeMancare(TipDesert.CLATITE, 330, 26);

            supaLegume.afiseazaDetalii();
            supaVita.afiseazaDetalii();

//            IFelMancare supaPui = fabricaSupe.getFelDeMancare(TipSupa.SUPA_PUI, 250, 22);
//            IFelMancare lavaCake = fabricaDesert.getFelDeMancare(TipDesert.LAVA_CAKE, 460, 35);

            papanasi.afiseazaDetalii();
            clatite.afiseazaDetalii();

        } catch (RuntimeException e) {
            System.err.println("Invalid type ");
        }

    }
}
