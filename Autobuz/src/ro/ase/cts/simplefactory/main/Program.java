package ro.ase.cts.simplefactory.main;

import ro.ase.cts.simplefactory.factory.TipTransport;
import ro.ase.cts.simplefactory.factory.TransportFactory;
import ro.ase.cts.simplefactory.transport.Autobuz;
import ro.ase.cts.simplefactory.transport.MijlocTransport;

public class Program {
    public static void main(String[] args){
        System.out.println("DA");

        TransportFactory transportFactory = new TransportFactory();

        try{
            MijlocTransport autobuz = transportFactory.createInstance(TipTransport.AUTOBUZ, 4, 20,
                    30.3);
            MijlocTransport tramvai = transportFactory.createInstance(TipTransport.TRAMVAI, 50, 20,
                    60);

            MijlocTransport troleibuz = transportFactory.createInstance(TipTransport.TROLEIUZ, 4, 20,
                    "half program");
            MijlocTransport autobuzNou = transportFactory.createInstance(TipTransport.AUTOBUZ, 4 ,30,
                    15);

            System.out.println(autobuz);
            System.out.println(tramvai);

            System.out.println(troleibuz);
            System.out.println(autobuzNou);

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
