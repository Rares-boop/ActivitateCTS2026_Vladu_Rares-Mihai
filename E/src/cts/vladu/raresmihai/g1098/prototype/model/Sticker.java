package cts.vladu.raresmihai.g1098.prototype.model;

public class Sticker implements ISticker{
    private double pret;
    private double dimensiune;

    private Sticker() {
    }

    public Sticker(Masina masina) {
        this.pret = (double) (masina.getAnFabricatie() * masina.getLatime() * masina.getLungime()) /4;
        this.dimensiune = (double) masina.getLungime() /2;
    }

    @Override
    public ISticker cloneaza() {
        Sticker newSticker = new Sticker();
        newSticker.pret = this.pret;
        newSticker.dimensiune = this.dimensiune;
        return newSticker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("pret=").append(pret);
        sb.append(", dimensiune=").append(dimensiune);
        sb.append('}');
        return sb.toString();
    }
}
