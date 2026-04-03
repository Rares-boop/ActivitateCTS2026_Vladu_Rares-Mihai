package cts.vladu.raresmihai.g1098.prototype.model;

public class BloodAnalysisReport extends AbstractBloodAnalysisReport{

    private BloodAnalysisReport() {
        super();
    }

    public BloodAnalysisReport(int id, String descriere) {
        super(id, descriere);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("BloodAnalysisReport{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractBloodAnalysisReport cloneaza() {
        BloodAnalysisReport newBloodAnalysisReport = new BloodAnalysisReport();
        newBloodAnalysisReport.id = this.id;
        newBloodAnalysisReport.descriere = this.descriere;
        return newBloodAnalysisReport;
    }
}
