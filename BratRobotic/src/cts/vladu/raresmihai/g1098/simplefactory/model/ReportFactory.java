package cts.vladu.raresmihai.g1098.simplefactory.model;

public class ReportFactory {
    public static TestReport createInstance(TipReport type, int idRaport, String numeRobot){
        switch (type){
            case SUCCESS -> {
                return new SuccessReport(idRaport, numeRobot);
            }
            case WARNING -> {
                return new WarningReport(idRaport, numeRobot);
            }
            case ERROR -> {
                return new ErrorReport(idRaport, numeRobot);
            }
            default -> throw new RuntimeException("Invalid raport type ");
        }
    }
}
