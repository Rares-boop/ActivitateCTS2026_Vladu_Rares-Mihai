package cts.vladu.raresmihai.g1098.builder.model;

public class MagazinBuilder implements AbstractMagazinBuilder{
    private String denumire;
    private double suprafata;
    private int nrIntrari;
    private Podea podea;
    private Decoratiune decoratiune;

    public MagazinBuilder() {
        this.denumire = "Default";
        this.suprafata = 100;
        this.nrIntrari = 1;
        this.podea = new Podea(false, 1);
        this.decoratiune = new Decoratiune(false, 2);
    }

    @Override
    public Magazin build() {

        if (this.nrIntrari < (this.suprafata / 100)) {
            throw new RuntimeException("Invalid iesiri: Prea puține intrări pentru suprafața cerută.");
        }

        if (this.podea.getGradDuritate() < 2 && this.decoratiune.isEsteDeSticla()) {
            throw new RuntimeException("Invalid decoratiune: Podeaua e prea moale pentru sticlă.");
        }

        return new Magazin(this.denumire, this.suprafata, this.nrIntrari, this.podea,
                this.decoratiune);
    }

    @Override
    public AbstractMagazinBuilder setDenumire(String denumire) {
        this.denumire = denumire;
        return this;
    }

    @Override
    public AbstractMagazinBuilder setSuprafata(double suprafata) {
        this.suprafata =suprafata;
        return this;
    }

    @Override
    public AbstractMagazinBuilder setNrIntrari(int nrIntrari) {
        this.nrIntrari = nrIntrari;
        return this;
    }

    @Override
    public AbstractMagazinBuilder setPodea(Podea podea) {
        this.podea = podea;
        return this;
    }

    @Override
    public AbstractMagazinBuilder setDecoratiune(Decoratiune decoratiune) {
        this.decoratiune = decoratiune;
        return this;
    }
}
