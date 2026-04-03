package cts.vladu.raresmihai.g1098.builder.model;

public interface AbstractHolidayPackageBuilder {
    HolidayPackage build();
    AbstractHolidayPackageBuilder setAreTransport(boolean areTransport);
    AbstractHolidayPackageBuilder setModalitateTransport(String modalitateTransport);
    AbstractHolidayPackageBuilder setAreCazare(boolean areCazare);
    AbstractHolidayPackageBuilder setDurata(int durata);
    AbstractHolidayPackageBuilder setAreExcursiiGrup(boolean areExcursiiGrup);
}
