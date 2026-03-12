package ro.ase.cts.simplefactory;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.MijlocTransport;
import ro.ase.cts.clase.Tramvai;
import ro.ase.cts.clase.Troleibuz;

public class TransportFactory {
    public MijlocTransport createInstance(Transport transportType, int nrRoti, int nrLocuri){
        return switch (transportType) {
            case Autobuz -> new Autobuz(nrRoti, nrLocuri);
            case Tramvai -> new Tramvai(nrRoti, nrLocuri);
            case Troleibuz -> new Troleibuz(nrRoti, nrLocuri);
            default -> throw new RuntimeException("Tip de transport invalid");
        };
    }
}
