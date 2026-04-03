package ro.ase.cts.factorymethod.model.desert;

import ro.ase.cts.factorymethod.model.IFelMancare;

public abstract class Desert implements IFelMancare {
    private double nrCalorii;
    private double pret;

    public Desert(double nrCalorii, double pret) {
        this.nrCalorii = nrCalorii;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nrCalorii=").append(nrCalorii);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
