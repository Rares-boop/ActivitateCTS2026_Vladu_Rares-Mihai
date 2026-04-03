package cts.vladu.raresmihai.g1098.builder.model;

public class AirQualitySensorBuilder implements AbstractAirQualitySensorBuilder{
    private int id;
    private boolean arePm;
    private boolean arePm10;
    private boolean areVoc;
    private boolean areCo2;
    private boolean areCo;

    public AirQualitySensorBuilder(int id) {
        this.id = id;
        this.arePm = false;
        this.arePm10 = false;
        this.areVoc = false;
        this.areCo2 = false;
        this.areCo = false;
    }

    @Override
    public AbstractAirQualitySensor build() {
        return new AirQualitySensor(this.id, this.arePm, this.arePm10, this.areVoc,
                this.areCo2, this.areCo);
    }

    @Override
    public AbstractAirQualitySensorBuilder setArePm(boolean arePm) {
        this.arePm = arePm;
        return this;
    }

    @Override
    public AbstractAirQualitySensorBuilder setArePm10(boolean arePm10) {
        this.arePm10 = arePm10;
        return this;
    }

    @Override
    public AbstractAirQualitySensorBuilder setAreVoc(boolean areVoc) {
        this.areVoc = areVoc;
        return this;
    }

    @Override
    public AbstractAirQualitySensorBuilder setAreCo2(boolean areCo2) {
        this.areCo2  = areCo2;
        return this;
    }

    @Override
    public AbstractAirQualitySensorBuilder setAreCo(boolean areCo) {
        this.areCo = areCo;
        return this;
    }
}
