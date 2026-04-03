package cts.vladu.raresmihai.g1098.builder.model;

public interface AbstractHolidayPackageBuilder {
    AbstractHolidayPackage build();
    AbstractHolidayPackageBuilder setTransport(String transport);
    AbstractHolidayPackageBuilder setCazare(String cazare);
    AbstractHolidayPackageBuilder setAreExcursiiGrup(boolean areExcursiiGrup);
    AbstractHolidayPackageBuilder setAreViziteMuzee(boolean areViziteMuzee);
    AbstractHolidayPackageBuilder setAreMicDejun(boolean areMicDejun);

}
