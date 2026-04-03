package cts.vladu.raresmihai.g1098.simplefactory.model;

public class Bara implements IComponenta{
    private int id;
    private String nume;

    public Bara(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Bara{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
