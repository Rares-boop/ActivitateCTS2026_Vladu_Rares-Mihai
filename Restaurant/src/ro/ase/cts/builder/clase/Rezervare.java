package ro.ase.cts.builder.clase;

public class Rezervare {
    private String nume;
    private String data;
    private boolean asrAsezareGeam;
    private boolean areScauneErgonomice;
    private boolean areMasaDecorata;
    private boolean areMuzicaAmbientala;
    private String genMuzica;

    public Rezervare(String nume, String data, boolean asrAsezareGeam, boolean areScauneErgonomice,
                     boolean areMasaDecorata, boolean areMuzicaAmbientala, String genMuzica) {
        this.nume = nume;
        this.data = data;
        this.asrAsezareGeam = asrAsezareGeam;
        this.areScauneErgonomice = areScauneErgonomice;
        this.areMasaDecorata = areMasaDecorata;
        this.areMuzicaAmbientala = areMuzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setAsrAsezareGeam(boolean asrAsezareGeam) {
        this.asrAsezareGeam = asrAsezareGeam;
    }

    public void setAreScauneErgonomice(boolean areScauneErgonomice) {
        this.areScauneErgonomice = areScauneErgonomice;
    }

    public void setAreMasaDecorata(boolean areMasaDecorata) {
        this.areMasaDecorata = areMasaDecorata;
    }

    public void setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
        this.areMuzicaAmbientala = areMuzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append(", asrAsezareGeam=").append(asrAsezareGeam);
        sb.append(", areScauneErgonomice=").append(areScauneErgonomice);
        sb.append(", areMasaDecorata=").append(areMasaDecorata);
        sb.append(", areMuzicaAmbientala=").append(areMuzicaAmbientala);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
