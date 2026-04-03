package ro.ase.cts.builder.clase;

public interface AbstractRezervareBuilder {
    Rezervare build();
    AbstractRezervareBuilder setAreAsezareGeam(boolean areAsezareGeam);
    AbstractRezervareBuilder setAreScauneErgonomice(boolean areScauneErgonomice);
    AbstractRezervareBuilder setAreMasaDecorata(boolean areMasaDecorata);
    AbstractRezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala);
    AbstractRezervareBuilder setGenMuzica(String genMuzica);

}
