package cts.vladu.raresmihai.g1098.factorymethod.model;

public abstract class Sport {
    protected String nume;
    protected String numeEchipaGazda;
    protected String  numeEchipaOaspete;

    public Sport(String nume, String numeEchipaGazda, String numeEchipaOaspete) {
        this.nume = nume;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspete = numeEchipaOaspete;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", numeEchipaGazda='").append(numeEchipaGazda).append('\'');
        sb.append(", numeEchipaOaspete='").append(numeEchipaOaspete).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
