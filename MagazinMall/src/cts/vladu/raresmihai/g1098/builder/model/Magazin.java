package cts.vladu.raresmihai.g1098.builder.model;

public class Magazin implements IMagazin{
    private String denumire;
    private double suprafata;
    private int nrIntrari;
    private Podea podea;
    private Decoratiune decoratiune;

    public Magazin(String denumire, double suprafata, int nrIntrari,
                   Podea podea, Decoratiune decoratiune) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.podea = podea;
        this.decoratiune = decoratiune;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Magazin{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", suprafata=").append(suprafata);
        sb.append(", nrIntrari=").append(nrIntrari);
        sb.append(", podea=").append(podea);
        sb.append(", decoratiune=").append(decoratiune);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calculGradIncendiu() {
        return (this.podea.getGradDuritate() * this.decoratiune.getInaltime() * 100) /
                this.suprafata;
    }
}
