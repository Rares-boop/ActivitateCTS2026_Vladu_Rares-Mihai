package ro.ase.cts.builder.main;

import ro.ase.cts.builder.clase.AbstractRezervareBuilder;
import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractRezervareBuilder rezervareBuilder = new RezervareBuilder("Rezervare",
                "astazi");
        AbstractRezervareBuilder rezervareBuilder1 = new RezervareBuilder("Alta rezervare",
                "maine");

        Rezervare rezervare = rezervareBuilder.setAreAsezareGeam(true).build();
        Rezervare rezervare1 = rezervareBuilder.setAreAsezareGeam(true).setAreMuzicaAmbientala(true)
                .setGenMuzica("Clasica").build();

        Rezervare newRezervare = rezervareBuilder1.setAreAsezareGeam(true).setAreMasaDecorata(true)
                .setAreScauneErgonomice(true).setAreMuzicaAmbientala(true).setGenMuzica("Clasic")
                .build();
        Rezervare newRezervare1 = rezervareBuilder1.setAreAsezareGeam(true).build();

        System.out.println(rezervare);
        System.out.println(rezervare1);

        System.out.println(newRezervare);
        System.out.println(newRezervare1);

    }
}
