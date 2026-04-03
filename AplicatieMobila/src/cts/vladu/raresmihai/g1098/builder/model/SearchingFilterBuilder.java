package cts.vladu.raresmihai.g1098.builder.model;

public class SearchingFilterBuilder implements AbstractSearchingFilterBuilder{
    private String titlu;
    private String gen;
    private int anAparitie;
    private String actori;
    private int rating;
    private String regizor;

    public SearchingFilterBuilder() {
    }

    @Override
    public AbstractSearchingFilter build() {
        return new SearchingFilter(titlu, gen, anAparitie, actori, rating, regizor);
    }

    @Override
    public AbstractSearchingFilterBuilder setTitlu(String titlu) {
        this.titlu = titlu;
        return this;
    }

    @Override
    public AbstractSearchingFilterBuilder setGen(String gen) {
        this.gen = gen;
        return this;
    }

    @Override
    public AbstractSearchingFilterBuilder setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
        return this;
    }

    @Override
    public AbstractSearchingFilterBuilder setActori(String actori) {
        this.actori = actori;
        return this;
    }

    @Override
    public AbstractSearchingFilterBuilder setRating(int rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public AbstractSearchingFilterBuilder setRegizor(String regizor) {
        this.regizor = regizor;
        return this;
    }
}
