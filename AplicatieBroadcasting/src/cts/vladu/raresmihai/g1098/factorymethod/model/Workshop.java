package cts.vladu.raresmihai.g1098.factorymethod.model;

public class Workshop implements IEvent{
    private String titlu;
    private String descriere;

    public Workshop(String titlu, String descriere) {
        this.titlu = titlu;
        this.descriere = descriere;
    }

    @Override
    public void afiseaza() {
        final StringBuilder sb = new StringBuilder("Workshop{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", descriere='").append(descriere).append('\'');
        sb.append('}');

        System.out.println(sb.toString());
    }

}
