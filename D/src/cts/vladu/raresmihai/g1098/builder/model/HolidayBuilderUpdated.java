package cts.vladu.raresmihai.g1098.builder.model;

public class HolidayBuilderUpdated implements AbstractHolidayPackageBuilder{
    private HolidayPackage holidayPackage;

    public HolidayBuilderUpdated() {
        this.holidayPackage = new HolidayPackage(false, "Default", false, 0);
    }

    @Override
    public AbstractHolidayPackage build() {
        return this.holidayPackage;
    }

    @Override
    public AbstractHolidayPackageBuilder setAreTransport(boolean areTransport) {
        this.holidayPackage.setAreTransport(areTransport);
        return this;
    }

    @Override
    public AbstractHolidayPackageBuilder setModalitateTransport(String modalitateTransport) {
        this.holidayPackage.setModalitateTransport(modalitateTransport);
        return this;
    }

    @Override
    public AbstractHolidayPackageBuilder setAreCazare(boolean areCazare) {
        this.holidayPackage.setAreCazare(areCazare);
        return this;
    }

    @Override
    public AbstractHolidayPackageBuilder setNrStele(int nrStele) {
        this.holidayPackage.setNrStele(nrStele);
        return this;
    }
}
