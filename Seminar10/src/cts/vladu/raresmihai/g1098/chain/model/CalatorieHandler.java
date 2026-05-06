package cts.vladu.raresmihai.g1098.chain.model;

public abstract class CalatorieHandler {
    protected  CalatorieHandler succesor;

    public CalatorieHandler() {
        this.succesor = null;
    }

    public void setCalatorieHandler(CalatorieHandler succesor){
        this.succesor = succesor;
    }

    public abstract String recomandaCalatorie(double distanta);
}
