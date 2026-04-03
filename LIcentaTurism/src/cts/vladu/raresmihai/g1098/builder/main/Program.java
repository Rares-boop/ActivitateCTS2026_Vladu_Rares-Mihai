package cts.vladu.raresmihai.g1098.builder.main;

import cts.vladu.raresmihai.g1098.builder.model.AbstractHolidayPackage;
import cts.vladu.raresmihai.g1098.builder.model.HolidayPackage;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractHolidayPackage holidayPackage = new HolidayPackage.HolidayPackageBuilder()
                .setAreTransport(true).setModalitateTransport("Masina").build();
        AbstractHolidayPackage newHolidayPackage = new HolidayPackage.HolidayPackageBuilder()
                .setAreCazare(true).setDurata(10).build();

        AbstractHolidayPackage holidayPackage1 = new HolidayPackage.HolidayPackageBuilder()
                .setAreTransport(true).setModalitateTransport("Avion").setDurata(10)
                .setAreExcursiiGrup(true).build();
        AbstractHolidayPackage holidayPackageBun = new HolidayPackage.HolidayPackageBuilder()
                .setAreCazare(true).setDurata(20).build();

        holidayPackage.afiseazaDetalii();
        newHolidayPackage.afiseazaDetalii();

        holidayPackage1.afiseazaDetalii();
        holidayPackageBun.afiseazaDetalii();

    }
}
