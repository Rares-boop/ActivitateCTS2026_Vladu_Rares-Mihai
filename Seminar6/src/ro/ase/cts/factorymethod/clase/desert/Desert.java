package ro.ase.cts.factorymethod.clase.desert;

import ro.ase.cts.factorymethod.clase.IFelMancare;

public abstract class Desert implements IFelMancare {
    protected double grama;
    protected double pret;
    protected double calorii;

    public Desert(double grama, double pret, double calorii) {
        this.grama = grama;
        this.pret = pret;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Desert{");
        sb.append("grama=").append(grama);
        sb.append(", pret=").append(pret);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }
}
