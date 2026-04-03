package ro.ase.cts.simplefactory.main;

import ro.ase.cts.simplefactory.clase.Supa;
import ro.ase.cts.simplefactory.factory.SupaFactory;
import ro.ase.cts.simplefactory.factory.TipSupa;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        SupaFactory supaFactory = SupaFactory.getInstance();
        SupaFactory supaFactory1 = SupaFactory.getInstance();

        Supa supaLegume = supaFactory.createInstance(TipSupa.SUPA_LEGUME, 200, 22);
        Supa supaCiupeci = supaFactory.createInstance(TipSupa.SUPA_CIUPERCI, 250, 25);

        Supa supaVita = supaFactory1.createInstance(TipSupa.SUPA_VITA, 300, 33);
        Supa supaLegume1 = supaFactory1.createInstance(TipSupa.SUPA_LEGUME, 200, 20);

        System.out.println(supaLegume);
        System.out.println(supaCiupeci);

        System.out.println(supaVita);
        System.out.println(supaLegume1);
    }
}
