package cts.vladu.raresmihai.g1098.factorymethod.model;

public class Handbal extends Sport{

    public Handbal(String nume, String numeEchipaGazda, String numeEchipaOaspete) {
        super(nume, numeEchipaGazda, numeEchipaOaspete);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Handbal{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
