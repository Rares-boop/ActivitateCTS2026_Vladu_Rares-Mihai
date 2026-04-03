package cts.vladu.raresmihai.g1098.factorymethod.model;

public class Baschet extends Sport{

    public Baschet(String nume, String numeEchipaGazda, String numeEchipaOaspete) {
        super(nume, numeEchipaGazda, numeEchipaOaspete);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Baschet{");
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
