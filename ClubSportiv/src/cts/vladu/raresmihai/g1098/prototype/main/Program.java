package cts.vladu.raresmihai.g1098.prototype.main;

import cts.vladu.raresmihai.g1098.prototype.model.ISportiv;
import cts.vladu.raresmihai.g1098.prototype.model.Sportiv;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        ISportiv sportiv = new Sportiv("Sportiv", 25, 24000, new ArrayList<>());
        ISportiv newSportiv = sportiv.cloneaza();

        ISportiv sportiv1 = sportiv.cloneaza();
        ISportiv sportivBun = sportiv.cloneaza();

        ((Sportiv)newSportiv).adaugaAntrenament("antrenament");
        ((Sportiv)sportiv1).setSalariu(20000);

        ((Sportiv)sportivBun).setVarsta(34);
        ((Sportiv)newSportiv).setNume("Alt sportiv");

        sportiv.afiseazaDetalii();
        newSportiv.afiseazaDetalii();

        sportiv1.afiseazaDetalii();
        sportivBun.afiseazaDetalii();
    }
}
