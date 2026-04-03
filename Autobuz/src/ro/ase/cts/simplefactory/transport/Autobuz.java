package ro.ase.cts.simplefactory.transport;

public class Autobuz extends MijlocTransport{
    private double consum;

    public Autobuz(int nrRoti, int nrLocuri, double consum) {
        super(nrRoti, nrLocuri);
        this.consum = consum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("consum=").append(consum);
        sb.append(super.toString());
        return sb.toString();
    }
}
