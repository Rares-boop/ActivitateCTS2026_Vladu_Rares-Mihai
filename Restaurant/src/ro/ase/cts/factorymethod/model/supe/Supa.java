package ro.ase.cts.factorymethod.model.supe;

import ro.ase.cts.factorymethod.model.IFelMancare;

public abstract class Supa implements IFelMancare {
    private double gramaj;
    private double pret;

    public Supa(double gramaj, double pret) {
        this.gramaj = gramaj;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
