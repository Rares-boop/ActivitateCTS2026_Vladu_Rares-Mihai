package cts.vladu.raresmihai.g1098.builder.main;

import cts.vladu.raresmihai.g1098.builder.model.AbstractSearchingFilter;
import cts.vladu.raresmihai.g1098.builder.model.SearchingFilterBuilder;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractSearchingFilter searchingFilter = new SearchingFilterBuilder().setActori("Multi actori")
                .setAnAparitie(2026).build();
        AbstractSearchingFilter searchingFilter1 = new SearchingFilterBuilder().setTitlu("Film nou")
                .setGen("Actiune").build();

        AbstractSearchingFilter filtruNou = new SearchingFilterBuilder().setTitlu("Film super")
                        .setGen("Actiune").setAnAparitie(1999).setActori("Foarte multi")
                        .setRating(9).setRegizor("Unul bun").build();
        AbstractSearchingFilter filtruUltra = new SearchingFilterBuilder().setTitlu("Film ultra")
                        .setGen("Frumos").setAnAparitie(2026).setRating(10).build();

        searchingFilter.afiseazaFiltru();
        searchingFilter1.afiseazaFiltru();

        filtruNou.afiseazaFiltru();
        filtruUltra.afiseazaFiltru();

    }
}
