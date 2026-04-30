package cts.vladu.raresmihai.g1098.flyweight.main;

import cts.vladu.raresmihai.g1098.flyweight.clase.Autobuz;
import cts.vladu.raresmihai.g1098.flyweight.clase.LinieAbstracta;
import cts.vladu.raresmihai.g1098.flyweight.clase.LinieFactory;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Autobuz autobuz = new Autobuz("Autobuz ", 2026, 50);
        Autobuz newAutobuz = new Autobuz("Autobuz nou ", 2026, 60);

        LinieFactory linieFactory = new LinieFactory();
        LinieAbstracta linie = linieFactory.getLinie(300, "Prima statie ", "Ultima statie ");

        LinieAbstracta newLinie = linieFactory.getLinie(500, "Aici ", "Final ");
        LinieAbstracta linieBun = linieFactory.getLinie(500, "Acasa ", "Afara ");

        linie.descriereLinie(autobuz);
        linie.afiseazaNumarMaximPasageriPeLinie(newAutobuz);

        newLinie.descriereLinie(autobuz);
        linieBun.afiseazaNumarMaximPasageriPeLinie(autobuz);
    }
}
