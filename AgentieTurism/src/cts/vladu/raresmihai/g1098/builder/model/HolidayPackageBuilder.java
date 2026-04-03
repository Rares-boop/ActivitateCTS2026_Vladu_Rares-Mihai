package cts.vladu.raresmihai.g1098.builder.model;

public class HolidayPackageBuilder implements AbstractHolidayPackageBuilder{
    private String transport;
    private String cazare;
    private boolean areExcursiiGrup;
    private boolean areViziteMuzee;
    private boolean areMicDejun;

    public HolidayPackageBuilder() {
        this.transport = "Default";
        this.cazare = "Default";
        this.areExcursiiGrup = false;
        this.areViziteMuzee = false;
        this.areMicDejun = false;
    }

    @Override
    public AbstractHolidayPackage build() {
        return new HolidayPackage(transport, cazare, areExcursiiGrup, areViziteMuzee, areMicDejun);
    }

    @Override
    public AbstractHolidayPackageBuilder setTransport(String transport) {
        this.transport = transport;
        return this;
    }

    @Override
    public AbstractHolidayPackageBuilder setCazare(String cazare) {
        this.cazare = cazare;
        return this;
    }

    @Override
    public AbstractHolidayPackageBuilder setAreExcursiiGrup(boolean areExcursiiGrup) {
        this.areExcursiiGrup = areExcursiiGrup;
        return this;
    }

    @Override
    public AbstractHolidayPackageBuilder setAreViziteMuzee(boolean areViziteMuzee) {
        this.areViziteMuzee = areViziteMuzee;
        return this;
    }

    @Override
    public AbstractHolidayPackageBuilder setAreMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }
}
