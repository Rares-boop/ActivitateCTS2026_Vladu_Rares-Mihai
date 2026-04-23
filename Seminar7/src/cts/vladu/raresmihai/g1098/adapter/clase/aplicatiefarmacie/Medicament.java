package cts.vladu.raresmihai.g1098.adapter.clase.aplicatiefarmacie;

public class Medicament {
    private String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    public void cumparaMedicament(){
        System.out.println("Medicament cumpara din farmacie ");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("nume='").append(nume).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
