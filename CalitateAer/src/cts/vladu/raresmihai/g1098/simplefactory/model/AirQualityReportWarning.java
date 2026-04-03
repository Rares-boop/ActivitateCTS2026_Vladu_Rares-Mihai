package cts.vladu.raresmihai.g1098.simplefactory.model;

public class AirQualityReportWarning implements AbstractAirQualityReport{
    private double pm;

    public AirQualityReportWarning(double pm) {
        this.pm = pm;
    }

    @Override
    public void afisezaDetalii() {
        StringBuilder sb = new StringBuilder("WARINING particulele fine sunt ");
        sb.append(this.pm);

        System.out.println(sb.toString());
    }
}
