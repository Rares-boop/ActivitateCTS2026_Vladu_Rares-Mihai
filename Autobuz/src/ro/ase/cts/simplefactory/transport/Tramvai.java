package ro.ase.cts.simplefactory.transport;

public class Tramvai extends MijlocTransport{
    private int lungime;

    public Tramvai(int nrRoti, int nrLocuri, int lungime) {
        super(nrRoti, nrLocuri);
        this.lungime = lungime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tramvai{");
        sb.append("lungime=").append(lungime);
        sb.append(super.toString());
        return sb.toString();
    }
}
