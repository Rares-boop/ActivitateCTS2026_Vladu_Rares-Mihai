package ro.ase.cts.scoala;

import ro.ase.cts.interfaces.IPersoana;

public abstract class Persoana implements IPersoana {
    private String nume;
    private int varsta;

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public String getNume() {
        return this.nume;
    }

    @Override
    public int getVarsta() {
        return this.varsta;
    }

    @Override
    public String toString() {
        return "Nume: " + this.nume + ", Varsta: " + this.varsta + " ani";
    }
}
