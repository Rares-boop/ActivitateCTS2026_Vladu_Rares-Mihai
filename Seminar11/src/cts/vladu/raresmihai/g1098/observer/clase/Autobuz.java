package cts.vladu.raresmihai.g1098.observer.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void plecareDepou() {
        String mesaj = "Autobuzul de pe linia " + super.linie + " pleaca din depou ";
        super.notificareObservatori(mesaj);
    }

    @Override
    public void ramaneBlocat() {
        String mesaj = "Autobuzul de pe linia " + super.linie + " ramane blocat in trafic ";
        super.notificareObservatori(mesaj);
    }
}
