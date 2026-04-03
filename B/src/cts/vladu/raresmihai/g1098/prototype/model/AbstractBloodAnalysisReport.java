package cts.vladu.raresmihai.g1098.prototype.model;

public abstract class AbstractBloodAnalysisReport implements IClonare {
    protected int id;
    protected String descriere;

    public AbstractBloodAnalysisReport(int id, String descriere) {
        this.id = id;
        this.descriere = descriere;
    }

    protected AbstractBloodAnalysisReport() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractBloodAnalysisReport{");
        sb.append("id=").append(id);
        sb.append(", descriere='").append(descriere).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
