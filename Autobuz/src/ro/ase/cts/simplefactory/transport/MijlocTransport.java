package ro.ase.cts.simplefactory.transport;

public abstract class MijlocTransport {
    protected int nrRoti;
    protected int nrLocuri;

    public MijlocTransport(int nrRoti, int nrLocuri) {
        this.nrRoti = nrRoti;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" nrRoti=").append(nrRoti);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
