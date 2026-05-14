package cts.vladu.raresmihai.g1098.observer.main;

import cts.vladu.raresmihai.g1098.observer.clase.Autobuz;
import cts.vladu.raresmihai.g1098.observer.clase.Calator;
import cts.vladu.raresmihai.g1098.observer.clase.CalatorAbonat;
import cts.vladu.raresmihai.g1098.observer.clase.MijlocTransport;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Calator calator = new CalatorAbonat("Calator ");
        Calator newCalator = new CalatorAbonat("Calator bun");

        Calator calatorBun = new CalatorAbonat("Alt calator");
        Calator calator1 = new CalatorAbonat("Calator aici");

        MijlocTransport autobuz = new Autobuz("7824");

        autobuz.abonareObservator(calator);
        autobuz.abonareObservator(newCalator);

        autobuz.plecareDepou();

        System.out.println("Blocare trafic ");
        autobuz.abonareObservator(calatorBun);
        autobuz.abonareObservator(calator1);

        autobuz.ramaneBlocat();
    }
}
