package cts.vladu.raresmihai.g1098.simplefactory.model;

public class Usa implements IComponenta {
    private int id;
    private String nume;

    public Usa(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Usa{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
