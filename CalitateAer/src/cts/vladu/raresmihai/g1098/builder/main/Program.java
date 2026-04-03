package cts.vladu.raresmihai.g1098.builder.main;

import cts.vladu.raresmihai.g1098.builder.model.AbstractAirQualitySensor;
import cts.vladu.raresmihai.g1098.builder.model.AirQualitySensorBuilder;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractAirQualitySensor sensor = new AirQualitySensorBuilder(10).setAreCo2(true)
                .setAreCo(true).build();
        AbstractAirQualitySensor newSensor = new AirQualitySensorBuilder(20).setArePm(true)
                        .setArePm10(true).setAreVoc(true).setAreCo2(true).setAreCo(true)
                        .build();

        AbstractAirQualitySensor sensorPm = new AirQualitySensorBuilder(50).setArePm(true)
                        .setArePm10(true).build();
        AbstractAirQualitySensor sensor1 = new AirQualitySensorBuilder(70).setArePm(true)
                        .setAreCo(true).build();

        sensor.afiseazaDetalii();
        newSensor.afiseazaDetalii();

        sensorPm.afiseazaDetalii();
        sensor1.afiseazaDetalii();

    }
}
