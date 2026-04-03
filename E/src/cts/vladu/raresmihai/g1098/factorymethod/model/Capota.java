package cts.vladu.raresmihai.g1098.factorymethod.model;

public class Capota implements IComponenta{
    private int id;
    private String nume;

    public Capota(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Capota{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
