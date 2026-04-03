package cts.vladu.raresmihai.g1098.builder.model;

public interface AbstractSearchingFilterBuilder {
    AbstractSearchingFilter build();
    AbstractSearchingFilterBuilder setTitlu(String titlu);
    AbstractSearchingFilterBuilder setGen(String gen);
    AbstractSearchingFilterBuilder setAnAparitie(int anAparitie);
    AbstractSearchingFilterBuilder setActori(String actori);
    AbstractSearchingFilterBuilder setRating(int rating);
    AbstractSearchingFilterBuilder setRegizor(String regizor);

}
