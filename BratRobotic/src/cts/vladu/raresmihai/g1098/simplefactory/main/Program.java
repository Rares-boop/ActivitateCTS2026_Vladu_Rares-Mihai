package cts.vladu.raresmihai.g1098.simplefactory.main;

import cts.vladu.raresmihai.g1098.simplefactory.model.ReportFactory;
import cts.vladu.raresmihai.g1098.simplefactory.model.TestReport;
import cts.vladu.raresmihai.g1098.simplefactory.model.TipReport;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        try{
            TestReport successRaport = ReportFactory.createInstance(TipReport.SUCCESS,
                    10, "Robot");
            TestReport warningRaport = ReportFactory.createInstance(TipReport.WARNING,
                    20, "Robot");

            TestReport errorRaport = ReportFactory.createInstance(TipReport.ERROR,
                    25, "Alt Robot");
            TestReport successRaport1 = ReportFactory.createInstance(TipReport.SUCCESS,
                    30, "Alt Robot");

            successRaport.afiseazaDetaliiRaport();
            warningRaport.afiseazaDetaliiRaport();

//            TestReport newRaport = ReportFactory.createInstance(TipReport.GOOD,
//                    40, "Salut");

            errorRaport.afiseazaDetaliiRaport();
            successRaport1.afiseazaDetaliiRaport();

        } catch (RuntimeException e) {
            System.err.println("Exceptie tip raport invalid ");
        }
    }
}
