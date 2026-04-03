package cts.vladu.raresmihai.g1098.builder.model;

public class Decoratiune {
    private boolean esteDeSticla;
    private double inaltime;

    public Decoratiune(boolean esteDeSticla, double inaltime) {
        this.esteDeSticla = esteDeSticla;
        this.inaltime = inaltime;
    }

    public boolean isEsteDeSticla() {
        return esteDeSticla;
    }

    public double getInaltime() {
        return inaltime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Decoratiune{");
        sb.append("esteDeSticla=").append(esteDeSticla);
        sb.append(", inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }
}
