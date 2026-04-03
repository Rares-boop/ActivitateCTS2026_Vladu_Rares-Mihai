package cts.vladu.raresmihai.g1098.builder.model;

public class SearchingFilter implements AbstractSearchingFilter {
    private String titlu;
    private String gen;
    private int anAparitie;
    private String actori;
    private int rating;
    private String regizor;

    public SearchingFilter(String titlu, String gen, int anAparitie, String actori,
                           int rating, String regizor) {
        this.titlu = titlu;
        this.gen = gen;
        this.anAparitie = anAparitie;
        this.actori = actori;
        this.rating = rating;
        this.regizor = regizor;
    }

    @Override
    public void afiseazaFiltru() {
        final StringBuilder sb = new StringBuilder("SearchingFilter{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", gen='").append(gen).append('\'');
        sb.append(", anAparitie=").append(anAparitie);
        sb.append(", actori='").append(actori).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", regizor='").append(regizor).append('\'');
        sb.append('}');

        System.out.println(sb.toString());
    }
}
