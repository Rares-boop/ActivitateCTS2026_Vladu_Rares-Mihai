package ro.ase.cts.clase;

public class Tramvai extends MijlocTransport{

    public Tramvai(int nrRoti, int nrLocuri) {
        super(nrRoti, nrLocuri);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Tramvaiul " + super.toString());
    }
}
