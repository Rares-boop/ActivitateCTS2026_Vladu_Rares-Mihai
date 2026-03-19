package ro.ase.cts.factorymethod.clase.supe;

import ro.ase.cts.factorymethod.clase.IFelMancare;

public abstract class Supa implements IFelMancare {
    protected double gramaj;
    protected double pret;

    public Supa(double gramaj, double pret) {
        this.gramaj = gramaj;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Supa{");
        sb.append("gramaj=").append(gramaj);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
