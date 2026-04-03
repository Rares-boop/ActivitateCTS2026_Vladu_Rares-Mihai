package cts.vladu.raresmihai.g1098.builder.model;

public interface AbstractMagazinBuilder {
    Magazin build();
    AbstractMagazinBuilder setDenumire(String denumire);
    AbstractMagazinBuilder setSuprafata(double suprafata);
    AbstractMagazinBuilder setNrIntrari(int nrIntrari);
    AbstractMagazinBuilder setPodea(Podea podea);
    AbstractMagazinBuilder setDecoratiune(Decoratiune decoratiune);
    
}
