package cts.vladu.raresmihai.g1098.proxy.clase;

public class Statie {
    private String nume;
    private int nrCalatori;

    public Statie(String nume, int nrCalatori) {
        this.nume = nume;
        this.nrCalatori = nrCalatori;
    }

    public String getNume() {
        return nume;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Statie{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrCalatori=").append(nrCalatori);
        sb.append('}');
        return sb.toString();
    }
}
