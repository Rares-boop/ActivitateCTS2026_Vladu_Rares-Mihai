package cts.vladu.raresmihai.g1098.simplefactory.model;

public class AirQualityReportFactory {
    public static AbstractAirQualityReport createRaport(double pm){
        if(pm >= 0 && pm <= 30){
            return new AirQualityReportClean(pm);
        }
        else if(pm > 30 && pm <=70){
            return new AirQualityReportWarning(pm);
        }
        else if(pm > 71){
            return new AirQualityReportRisc(pm);
        }
        else{
            throw new RuntimeException("Invalid pm valoare ");
        }
    }
}
