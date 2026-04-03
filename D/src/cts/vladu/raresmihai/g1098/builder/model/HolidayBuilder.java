package cts.vladu.raresmihai.g1098.builder.model;

public class HolidayBuilder implements AbstractHolidayPackageBuilder{
    private boolean areTransport;
    private String modalitateTransport;
    private boolean areCazare;
    private int nrStele;

    public HolidayBuilder() {
        this.areTransport = false;
        this.modalitateTransport = "Default ";
        this.areCazare = false;
        this.nrStele = 0;
    }

    @Override
    public AbstractHolidayPackage build() {
        return new HolidayPackage(areTransport, modalitateTransport, areCazare, nrStele);
    }

    @Override
    public AbstractHolidayPackageBuilder setAreTransport(boolean areTransport) {
        this.areTransport = areTransport;
        return this;
    }

    @Override
    public AbstractHolidayPackageBuilder setModalitateTransport(String modalitateTransport) {
        this.modalitateTransport = modalitateTransport;
        return this;
    }

    @Override
    public AbstractHolidayPackageBuilder setAreCazare(boolean areCazare) {
        this.areCazare = areCazare;
        return this;
    }

    @Override
    public AbstractHolidayPackageBuilder setNrStele(int nrStele) {
        this.nrStele = nrStele;
        return this;
    }
}
