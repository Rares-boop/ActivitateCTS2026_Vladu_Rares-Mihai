package ro.ase.cts.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int nrRoti, int nrLocuri) {
        super(nrRoti, nrLocuri);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Autobuzul "+super.toString());
    }
}
