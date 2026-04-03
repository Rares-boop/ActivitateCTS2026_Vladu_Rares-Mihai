package ro.ase.cts.simplefactory.factory;

import ro.ase.cts.simplefactory.clase.Supa;
import ro.ase.cts.simplefactory.clase.SupaCiuperci;
import ro.ase.cts.simplefactory.clase.SupaLegume;
import ro.ase.cts.simplefactory.clase.SupaVita;

public class SupaFactory {
    private static SupaFactory supaFactory = null;

    private SupaFactory() {
    }

    public static SupaFactory getInstance(){
        if(supaFactory == null){
            supaFactory = new SupaFactory();
        }
        return supaFactory;
    }

    public Supa createInstance(TipSupa type, double gramaj, double pret){
        switch (type){
            case SUPA_LEGUME -> {
                return new SupaLegume(gramaj, pret);
            }
            case SUPA_CIUPERCI -> {
                return new SupaCiuperci(gramaj, pret);
            }
            case SUPA_VITA -> {
                return new SupaVita(gramaj, pret);
            }
            default -> throw new RuntimeException("Invalid supa type ");
        }
    }
}
