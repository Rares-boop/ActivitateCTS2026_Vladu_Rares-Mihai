package cts.vladu.raresmihai.g1098.factorymethod.model;

public class Fotbal extends Sport{

    public Fotbal(String nume, String numeEchipaGazda, String numeEchipaOaspete) {
        super(nume, numeEchipaGazda, numeEchipaOaspete);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fotbal{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
