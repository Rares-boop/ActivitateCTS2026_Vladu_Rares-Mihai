package ro.ase.cts.clase;

public class Troleibuz extends MijlocTransport{

    public Troleibuz(int nrRoti, int nrLocuri) {
        super(nrRoti, nrLocuri);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Troleibuzul " + super.toString());
    }
}
