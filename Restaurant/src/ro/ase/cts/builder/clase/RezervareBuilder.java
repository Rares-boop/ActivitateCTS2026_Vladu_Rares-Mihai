package ro.ase.cts.builder.clase;

public class RezervareBuilder implements AbstractRezervareBuilder{
    private Rezervare rezervare;

    public RezervareBuilder(String nume, String data) {
        this.rezervare = new Rezervare(nume, data, false, false,
                false, false, "default");
    }

    @Override
    public Rezervare build() {
        return this.rezervare;
    }

    @Override
    public AbstractRezervareBuilder setAreAsezareGeam(boolean areAsezareGeam) {
        this.rezervare.setAsrAsezareGeam(areAsezareGeam);
        return this;
    }

    @Override
    public AbstractRezervareBuilder setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.rezervare.setAreScauneErgonomice(areScauneErgonomice);
        return this;
    }

    @Override
    public AbstractRezervareBuilder setAreMasaDecorata(boolean areMasaDecorata) {
        this.rezervare.setAreMasaDecorata(areMasaDecorata);
        return this;
    }

    @Override
    public AbstractRezervareBuilder setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.rezervare.setAreMuzicaAmbientala(areMuzicaAmbientala);
        return this;
    }

    @Override
    public AbstractRezervareBuilder setGenMuzica(String genMuzica) {
        this.rezervare.setGenMuzica(genMuzica);
        return this;
    }
}
