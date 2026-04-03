package cts.vladu.raresmihai.g1098.singleton.model;

public abstract class AbstractMembership {
    private String numeAbonament;
    private double pret;

    public AbstractMembership() {
    }

    public AbstractMembership(String numeAbonament, double pret) {
        this.numeAbonament = numeAbonament;
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AbstractMembership{");
        sb.append("numeAbonament='").append(numeAbonament).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
