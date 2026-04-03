package cts.vladu.raresmihai.g1098.simplefactory.model;

public class AirQualityReportClean implements AbstractAirQualityReport{
    private double pm;

    public AirQualityReportClean(double pm) {
        this.pm = pm;
    }

    @Override
    public void afisezaDetalii() {
        StringBuilder sb = new StringBuilder("AERUL ESTE CURAT cu particule fine ");
        sb.append(this.pm);

        System.out.println(sb.toString());
    }
}
