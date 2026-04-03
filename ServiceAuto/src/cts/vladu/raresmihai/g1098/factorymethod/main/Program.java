package cts.vladu.raresmihai.g1098.factorymethod.main;

import cts.vladu.raresmihai.g1098.factorymethod.model.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractFactoryComponenta baraFactory = new BaraFactory();
        AbstractFactoryComponenta usaFactory = new UsaFactory();

        AbstractFactoryComponenta capotaFactory = new CapotaFactory();
        AbstractFactoryComponenta portbagajFactory = new PortbagajFactory();

        IComponenta bara = baraFactory.getComponenta("Albastru ");
        IComponenta usa = usaFactory.getComponenta(700);

        IComponenta capota = capotaFactory.getComponenta("Albastru ");
        IComponenta portbagaj = portbagajFactory.getComponenta(70);

        bara.afiseazaDetalii();
        usa.afiseazaDetalii();

        capota.afiseazaDetalii();
        portbagaj.afiseazaDetalii();
    }
}
