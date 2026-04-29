package cts.vladu.raresmihai.g1098.composite.clase;

public class Sectie implements DepartamentAbstarct{
    private String nume;
    private int nrAngajati;

    public Sectie(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Sectie "  + this.nume);
    }

    @Override
    public void adaugaNod(DepartamentAbstarct nod) {

    }

    @Override
    public void stergeNod(DepartamentAbstarct nod) {

    }

    @Override
    public DepartamentAbstarct getNodCopil(int index) {
        return null;
    }
}
