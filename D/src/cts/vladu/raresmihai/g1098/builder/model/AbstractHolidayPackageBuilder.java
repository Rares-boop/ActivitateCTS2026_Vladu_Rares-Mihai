package cts.vladu.raresmihai.g1098.builder.model;

public interface AbstractHolidayPackageBuilder {
    AbstractHolidayPackage build();
    AbstractHolidayPackageBuilder setAreTransport(boolean areTransport);
    AbstractHolidayPackageBuilder setModalitateTransport(String modalitateTransport);
    AbstractHolidayPackageBuilder setAreCazare(boolean areCazare);
    AbstractHolidayPackageBuilder setNrStele(int nrStele);
}
