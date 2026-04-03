package cts.vladu.raresmihai.g1098.prototype.model;

public class Masina implements IMasina{
    private String model;
    private int anFabricatie;
    private int lungime;
    private int latime;

    public Masina(String model, int anFabricatie, int lungime, int latime) {
        this.model = model;
        this.anFabricatie = anFabricatie;
        this.lungime = lungime;
        this.latime = latime;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAnFabricatie() {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie) {
        this.anFabricatie = anFabricatie;
    }

    public int getLungime() {
        return lungime;
    }

    public void setLungime(int lungime) {
        this.lungime = lungime;
    }

    public int getLatime() {
        return latime;
    }

    public void setLatime(int latime) {
        this.latime = latime;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Masina{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricatie=").append(anFabricatie);
        sb.append(", lungime=").append(lungime);
        sb.append(", latime=").append(latime);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
