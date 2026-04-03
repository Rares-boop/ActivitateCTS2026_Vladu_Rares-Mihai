package cts.vladu.raresmihai.g1098.builder.model;

public class Filtru implements AbstractSearchingFilter{
    private String titlu;
    private String gen;
    private int anulAparitiei;
    private String actori;
    private double rating;
    private String regizor;

    private Filtru(String titlu, String gen, int anulAparitiei, String actori,
                  double rating, String regizor) {
        this.titlu = titlu;
        this.gen = gen;
        this.anulAparitiei = anulAparitiei;
        this.actori = actori;
        this.rating = rating;
        this.regizor = regizor;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Filtru{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", gen='").append(gen).append('\'');
        sb.append(", anulAparitiei=").append(anulAparitiei);
        sb.append(", actori='").append(actori).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", regizor='").append(regizor).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }

    public static class Builder implements AbstractBuilder{
        private String titlu;
        private String gen;
        private int anulAparitiei;
        private String actori;
        private double rating;
        private String regizor;

        public Builder() {
            this.titlu = "Default ";
            this.gen = "Film ";
            this.anulAparitiei = 2026;
            this.actori = "Acotri ";
            this.rating = 10;
            this.regizor = "Regizor ";
        }

        @Override
        public Filtru build() {
            return new Filtru(titlu, gen, anulAparitiei, actori, rating, regizor);
        }

        @Override
        public AbstractBuilder setTitlu(String titlu) {
            this.titlu = titlu;
            return this;
        }

        @Override
        public AbstractBuilder setGen(String gen) {
            this.gen = gen;
            return this;
        }

        @Override
        public AbstractBuilder setAnulAparitiei(int anulAparitiei) {
            this.anulAparitiei = anulAparitiei;
            return this;
        }

        @Override
        public AbstractBuilder setActori(String actori) {
            this.actori = actori;
            return this;
        }

        @Override
        public AbstractBuilder setRating(double rating) {
            this.rating = rating;
            return this;
        }

        @Override
        public AbstractBuilder setRegizor(String regizor) {
            this.regizor = regizor;
            return this;
        }
    }
}
