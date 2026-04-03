package ro.ase.cts.simplefactory.clase;

public abstract class Supa {
    public double gramaj;
    public double pret;

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
