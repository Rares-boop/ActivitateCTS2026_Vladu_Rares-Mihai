package cts.vladu.raresmihai.g1098.composite.main;

import cts.vladu.raresmihai.g1098.composite.clase.Departament;
import cts.vladu.raresmihai.g1098.composite.clase.DepartamentAbstarct;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        DepartamentAbstarct spital = new Departament("Spital");

        spital.afiseazaDetalii();
    }
}
