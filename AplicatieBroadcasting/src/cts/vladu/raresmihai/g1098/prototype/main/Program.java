package cts.vladu.raresmihai.g1098.prototype.main;

import cts.vladu.raresmihai.g1098.prototype.model.Webminar;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        List<String> listaComentarii = new ArrayList<>();

        listaComentarii.add("Un comentariu");
        listaComentarii.add("Alt comentariu");

        Webminar webminar = new Webminar("Webminar", "Un curs online", listaComentarii,
                20);
        Webminar newWebminar = webminar.cloneazaWebminar();

        Webminar ultraWebminar = webminar.cloneazaWebminar();
        Webminar altWebminar = webminar.cloneazaWebminar();

        newWebminar.setTitlu("Webminar nou");
        newWebminar.setNrVizitatori(100);

        ultraWebminar.adaugaComentariu("Un nou comentariu");
        ultraWebminar.setDescriere("O noua descriere");

        altWebminar.setTitlu("Cel mai bun webminar");
        altWebminar.setNrVizitatori(200);

        System.out.println(webminar);
        System.out.println(newWebminar);

        System.out.println(ultraWebminar);
        System.out.println(altWebminar);

    }
}
