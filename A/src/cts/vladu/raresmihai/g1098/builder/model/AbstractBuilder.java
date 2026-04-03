package cts.vladu.raresmihai.g1098.builder.model;

public interface AbstractBuilder {
    Filtru build();
    AbstractBuilder setTitlu(String titlu);
    AbstractBuilder setGen(String gen);
    AbstractBuilder setAnulAparitiei(int anulAparitiei);
    AbstractBuilder setActori(String actori);
    AbstractBuilder setRating(double rating);
    AbstractBuilder setRegizor(String regizor);
}
