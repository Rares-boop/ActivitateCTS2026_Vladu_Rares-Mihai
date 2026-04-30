package cts.vladu.raresmihai.g1098.proxy.main;

import cts.vladu.raresmihai.g1098.proxy.clase.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        MijlocDeTransport autobuz = new Autobuz(10, 700);
        MijlocDeTransport newAutobuz = new Autobuz(0, 500);

        Statie statie = new Statie("Statie ",5);
        Statie newStatie = new Statie("Aici ",0);

        autobuz.opresteStatie(statie);
        newAutobuz.opresteStatie(newStatie);

        MijlocDeTransport autobuzNoapte = new ProxyAutobuz(autobuz);
        MijlocDeTransport autobuzBun = new ProxyAutobuz(newAutobuz);

        autobuzNoapte.opresteStatie(statie);
        autobuzNoapte.opresteStatie(newStatie);

        autobuzBun.opresteStatie(statie);
        autobuzBun.opresteStatie(newStatie);

        MijlocDeTransport autobuzCursaSpeciala = new AutobuzCursaSpeciala(new ProxyAutobuz(
                autobuz
        ));
        MijlocDeTransport autobuzBunCursaSpeciala = new AutobuzCursaSpeciala(new ProxyAutobuz(
                new Autobuz(50, 890, TipCursa.CURSA_SPECIALA)
        ));

        autobuzCursaSpeciala.opresteStatie(statie);
        autobuzBunCursaSpeciala.opresteStatie(statie);

    }
}
