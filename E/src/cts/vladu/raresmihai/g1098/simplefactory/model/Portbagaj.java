package cts.vladu.raresmihai.g1098.simplefactory.model;

public class Portbagaj implements IComponenta{
    private int id;
    private String nume;

    public Portbagaj(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Portbagaj{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
