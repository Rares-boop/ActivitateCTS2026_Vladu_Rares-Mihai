package cts.vladu.raresmihai.g1098.simplefactory.model;

public class AirQualityReportRisc implements AbstractAirQualityReport{
    private double pm;

    public AirQualityReportRisc(double pm) {
        this.pm = pm;
    }

    @Override
    public void afisezaDetalii() {
        StringBuilder sb = new StringBuilder("AERUL ESTE UN FACTOR DE RISC cu particule fine ");
        sb.append(this.pm);

        System.out.println(sb.toString());
    }
}
