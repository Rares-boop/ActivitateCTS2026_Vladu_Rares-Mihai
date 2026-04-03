package cts.vladu.raresmihai.g1098.builder.main;

import cts.vladu.raresmihai.g1098.builder.model.AbstractHolidayPackage;
import cts.vladu.raresmihai.g1098.builder.model.HolidayPackageBuilder;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractHolidayPackage holidayPackage = new HolidayPackageBuilder().build();
        AbstractHolidayPackage holidayPackage1 = new HolidayPackageBuilder().setTransport("Masina")
                .setAreExcursiiGrup(true).setAreViziteMuzee(true).setAreMicDejun(true).build();

        holidayPackage.afiseazaDetaliiPachet();
        holidayPackage1.afiseazaDetaliiPachet();

    }
}
