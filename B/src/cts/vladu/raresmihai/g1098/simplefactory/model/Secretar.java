package cts.vladu.raresmihai.g1098.simplefactory.model;

public class Secretar implements IPersonal{
    private String nume;
    private String domeniu;

    public Secretar(String nume, String domeniu) {
        this.nume = nume;
        this.domeniu = domeniu;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Secretar{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", domeniu='").append(domeniu).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
