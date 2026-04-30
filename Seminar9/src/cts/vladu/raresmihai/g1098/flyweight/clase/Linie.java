package cts.vladu.raresmihai.g1098.flyweight.clase;

public class Linie implements LinieAbstracta{
    private String primaStatie;
    private String ultimaStatie;
    private int nrLinie;

    public Linie(String primaStatie, String ultimaStatie, int nrLinie) {
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.nrLinie = nrLinie;
    }

    @Override
    public void descriereLinie(Autobuz autobuz) {
        System.out.println("Linia " + this.nrLinie + " prima statie " + this.primaStatie + " ultima statie " + this.ultimaStatie + " circula autobuzul " + autobuz.getModel());
    }

    @Override
    public void afiseazaNumarMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.println("Linia " + this.nrLinie + " numarul maxim de pasageri este " + autobuz.getNrLocuri());
    }
}
