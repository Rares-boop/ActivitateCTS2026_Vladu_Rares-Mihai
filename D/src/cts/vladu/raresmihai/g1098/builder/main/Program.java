package cts.vladu.raresmihai.g1098.builder.main;

import cts.vladu.raresmihai.g1098.builder.model.AbstractHolidayPackage;
import cts.vladu.raresmihai.g1098.builder.model.HolidayBuilder;
import cts.vladu.raresmihai.g1098.builder.model.HolidayBuilderUpdated;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractHolidayPackage holidayPackage = new HolidayBuilder().setAreCazare(true).build();
        AbstractHolidayPackage newHolidayPackage = new HolidayBuilder().setAreTransport(true)
                .setModalitateTransport("avion ").build();

        AbstractHolidayPackage holidayPackage1 = new HolidayBuilderUpdated().setAreCazare(true)
                        .setNrStele(5).build();
        AbstractHolidayPackage holidayPackageBun = new HolidayBuilderUpdated().setAreTransport(true)
                        .setModalitateTransport("avion ").build();

        holidayPackage.afiseazaDetalii();
        newHolidayPackage.afiseazaDetalii();

        holidayPackage1.afiseazaDetalii();
        holidayPackageBun.afiseazaDetalii();
    }
}
