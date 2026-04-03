package cts.vladu.raresmihai.g1098.builder.main;

import cts.vladu.raresmihai.g1098.builder.model.AbstractSearchingFilter;
import cts.vladu.raresmihai.g1098.builder.model.Filtru;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractSearchingFilter filtru = new Filtru.Builder().setActori("Actor bun").build();
        AbstractSearchingFilter fitru1 = new Filtru.Builder().setAnulAparitiei(1990).build();

        AbstractSearchingFilter newFiltru = new Filtru.Builder().setGen("Actiune").build();
        AbstractSearchingFilter filtruBun = new Filtru.Builder().setRegizor("Regizor bun").build();

        filtru.afiseazaDetalii();
        fitru1.afiseazaDetalii();

        newFiltru.afiseazaDetalii();
        filtruBun.afiseazaDetalii();

    }
}
