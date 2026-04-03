package cts.vladu.raresmihai.g1098.prototype.main;

import cts.vladu.raresmihai.g1098.prototype.model.AbstractBloodAnalysisReport;
import cts.vladu.raresmihai.g1098.prototype.model.BloodAnalysisReport;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractBloodAnalysisReport bloodAnalysisReport = new BloodAnalysisReport(5, "Salut ");
        AbstractBloodAnalysisReport newBloodAnalysisReport = bloodAnalysisReport.cloneaza();

        newBloodAnalysisReport.setId(6);
        newBloodAnalysisReport.setDescriere("New descriere");

        System.out.println(bloodAnalysisReport);
        System.out.println(newBloodAnalysisReport);
    }
}
