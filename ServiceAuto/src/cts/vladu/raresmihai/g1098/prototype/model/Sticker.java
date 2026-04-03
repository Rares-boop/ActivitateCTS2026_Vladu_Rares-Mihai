package cts.vladu.raresmihai.g1098.prototype.model;

public class Sticker implements ISticker {
    private String numeSticker;
    private double dimensiune;
    private double pret;
    private double timpLipire;

    private Sticker() {
    }

    public Sticker(IMasina masina){
        this.numeSticker = "Sticker " + masina.getModel();
        this.dimensiune = masina.getDimensiune() / 2;
        this.pret = (masina.getDimensiune()*masina.getNrRoti())/2;
        this.timpLipire = (masina.getDimensiune() * masina.getAnAparitie())
                / masina.getNrRoti();
    }

    public void setNumeSticker(String numeSticker) {
        this.numeSticker = numeSticker;
    }

    public void setDimensiune(double dimensiune) {
        this.dimensiune = dimensiune;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setTimpLipire(double timpLipire) {
        this.timpLipire = timpLipire;
    }

    @Override
    public ISticker cloneaza() {
        Sticker newSticker = new Sticker();
        newSticker.setNumeSticker(this.numeSticker);
        newSticker.setDimensiune(this.dimensiune);
        newSticker.setPret(this.pret);
        newSticker.setTimpLipire(this.timpLipire);

        return newSticker;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("numeSticker='").append(numeSticker).append('\'');
        sb.append(", dimensiune=").append(dimensiune);
        sb.append(", pret=").append(pret);
        sb.append(", timpLipire=").append(timpLipire);
        sb.append('}');
        return sb.toString();
    }
}
