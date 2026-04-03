package cts.vladu.raresmihai.g1098.prototype.main;

import cts.vladu.raresmihai.g1098.prototype.model.ILive;
import cts.vladu.raresmihai.g1098.prototype.model.Live;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        List<String> comentarii = new ArrayList<>();

        ILive live = new Live("Live", 200, 100, comentarii);
        ILive newLive = live.cloneaza();

        ((Live)newLive).setNume("Alt live");
        ((Live)newLive).adaugaComentariu("Comentariu");

        live.afiseazaDetalii();
        newLive.afiseazaDetalii();
    }
}
