package cts.vladu.raresmihai.g1098.simplefactory.main;

import cts.vladu.raresmihai.g1098.simplefactory.model.AbstractAirQualityReport;
import cts.vladu.raresmihai.g1098.simplefactory.model.AirQualityReportFactory;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        try {
            AbstractAirQualityReport raportBun = AirQualityReportFactory.createRaport(2.5);
            AbstractAirQualityReport raportWarning = AirQualityReportFactory.createRaport(35);

            AbstractAirQualityReport raportMaiPutinBun = AirQualityReportFactory.createRaport(90);
            AbstractAirQualityReport raportBun1 = AirQualityReportFactory.createRaport(10);

            raportBun.afisezaDetalii();
            raportWarning.afisezaDetalii();

            raportMaiPutinBun.afisezaDetalii();
            raportBun1.afisezaDetalii();

        } catch (RuntimeException e) {
            System.err.println("Invalid pm valoare ");
        }
    }
}
