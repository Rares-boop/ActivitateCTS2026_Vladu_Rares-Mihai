package cts.vladu.raresmihai.g1098.singletonregistry.model;

public class Preparat {
    private String nume;
    private int timpPreparare;

    public Preparat(String nume, int timpPreparare) {
        this.nume = nume;
        this.timpPreparare = timpPreparare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Preparat{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", timpPreparare=").append(timpPreparare);
        sb.append('}');
        return sb.toString();
    }
}
