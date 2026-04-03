package cts.vladu.raresmihai.g1098.builder.model;

public interface AbstractAirQualitySensorBuilder {
    AbstractAirQualitySensor build();
    AbstractAirQualitySensorBuilder setArePm(boolean arePm);
    AbstractAirQualitySensorBuilder setArePm10(boolean arePm10);
    AbstractAirQualitySensorBuilder setAreVoc(boolean areVoc);
    AbstractAirQualitySensorBuilder setAreCo2(boolean areCo2);
    AbstractAirQualitySensorBuilder setAreCo(boolean areCo);
}
