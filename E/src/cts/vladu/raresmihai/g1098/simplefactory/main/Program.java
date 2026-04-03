package cts.vladu.raresmihai.g1098.simplefactory.main;

import cts.vladu.raresmihai.g1098.simplefactory.model.ComponentaFactory;
import cts.vladu.raresmihai.g1098.simplefactory.model.IComponenta;
import cts.vladu.raresmihai.g1098.simplefactory.model.TipComponenta;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        IComponenta usa = ComponentaFactory.getComponenta(TipComponenta.USA, 5, "Usa ");
        IComponenta capota = ComponentaFactory.getComponenta(TipComponenta.CAPOTA, 6, "Capota ");

        IComponenta bara = ComponentaFactory.getComponenta(TipComponenta.BARA, 7, "Bara ");
        IComponenta portbagaj = ComponentaFactory.getComponenta(TipComponenta.PORTBAGAJ, 8 ,"Portbagaj ");

        usa.afiseazaDetalii();
        capota.afiseazaDetalii();

        bara.afiseazaDetalii();
        portbagaj.afiseazaDetalii();

    }
}
