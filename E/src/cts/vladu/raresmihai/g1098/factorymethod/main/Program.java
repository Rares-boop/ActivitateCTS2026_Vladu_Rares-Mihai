package cts.vladu.raresmihai.g1098.factorymethod.main;

import cts.vladu.raresmihai.g1098.factorymethod.model.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractComponentaFactory baraFactory = new BaraFactory();
        AbstractComponentaFactory capotaFactory = new CapotaFactory();

        AbstractComponentaFactory usaFactory = new UsaFactory();
        AbstractComponentaFactory portbagajFactory = new PortbagajFactory();

        IComponenta bara = baraFactory.getComponenta(5, "Bara ");
        IComponenta capota = capotaFactory.getComponenta(6, "Capota ");

        IComponenta usa = usaFactory.getComponenta(7, "Usa ");
        IComponenta portbagaj = portbagajFactory.getComponenta(8, "Portbagaj ");

        bara.afiseazaDetalii();
        capota.afiseazaDetalii();

        usa.afiseazaDetalii();
        portbagaj.afiseazaDetalii();

    }
}
