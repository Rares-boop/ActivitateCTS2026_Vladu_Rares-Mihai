package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.simplefactory.Transport;
import ro.ase.cts.simplefactory.TransportFactory;

public class Program {
    public static void main(String[] args){
        System.out.println("DA");

        TransportFactory transportFactory = new TransportFactory();
        try {
            MijlocTransport autobuz = transportFactory.createInstance(Transport.Autobuz, 4, 10);
            MijlocTransport tramvai = transportFactory.createInstance(Transport.Tramvai, 10, 20);
            MijlocTransport troleibuz = transportFactory.createInstance(Transport.Troleibuz, 4, 15);
            MijlocTransport autobuzNou = transportFactory.createInstance(Transport.Autobuz, 4, 30);

            autobuz.afiseazaDescriere();
            tramvai.afiseazaDescriere();

            troleibuz.afiseazaDescriere();
            autobuzNou.afiseazaDescriere();

        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
