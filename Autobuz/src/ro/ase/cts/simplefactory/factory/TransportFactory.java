package ro.ase.cts.simplefactory.factory;

import ro.ase.cts.simplefactory.transport.Autobuz;
import ro.ase.cts.simplefactory.transport.MijlocTransport;
import ro.ase.cts.simplefactory.transport.Tramvai;
import ro.ase.cts.simplefactory.transport.Troleibuz;

public class TransportFactory {
    public MijlocTransport createInstance(TipTransport type, int nrRoti, int nrLocuri,
                                          double consum){
        switch (type){
            case AUTOBUZ -> {
                return new Autobuz(nrRoti, nrLocuri, consum);
            }
            case TRAMVAI -> {
                return new Tramvai(nrRoti, nrLocuri, 20);
            }
            case TROLEIUZ -> {
                return new Troleibuz(nrRoti, nrLocuri, "full");
            }
            default -> throw new RuntimeException("Invalid transport type");
        }
    }

    public MijlocTransport createInstance(TipTransport type, int nrRoti, int nrLocuri,
                                          int lungime){
        switch (type){
            case AUTOBUZ -> {
                return new Autobuz(nrRoti, nrLocuri, 20.2);
            }
            case TRAMVAI -> {
                return new Tramvai(nrRoti, nrLocuri, lungime);
            }
            case TROLEIUZ -> {
                return new Troleibuz(nrRoti, nrLocuri, "full");
            }
            default -> throw new RuntimeException("Invalid transport type");
        }
    }

    public MijlocTransport createInstance(TipTransport type, int nrRoti, int nrLocuri,
                                          String program){
        switch (type){
            case AUTOBUZ -> {
                return new Autobuz(nrRoti, nrLocuri, 20.2);
            }
            case TRAMVAI -> {
                return new Tramvai(nrRoti, nrLocuri, 20);
            }
            case TROLEIUZ -> {
                return new Troleibuz(nrRoti, nrLocuri, program);
            }
            default -> throw new RuntimeException("Invalid transport type");
        }
    }
}
