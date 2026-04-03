package cts.vladu.raresmihai.g1098.prototype.model;

public class Masina implements IMasina{
    private String model;
    private int anAparitie;
    private double dimensiune;
    private int nrRoti;

    public Masina(String model, int anAparitie, double dimensiune, int nrRoti) {
        this.model = model;
        this.anAparitie = anAparitie;
        this.dimensiune = dimensiune;
        this.nrRoti = nrRoti;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anAparitie=").append(anAparitie);
        sb.append(", dimensiune=").append(dimensiune);
        sb.append(", nrRoti=").append(nrRoti);
        sb.append('}');

        System.out.println(sb.toString());
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getAnAparitie() {
        return this.anAparitie;
    }

    @Override
    public double getDimensiune() {
        return this.dimensiune;
    }

    @Override
    public int getNrRoti() {
        return this.nrRoti;
    }
}
