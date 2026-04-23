package cts.vladu.raresmihai.g1098.adapter.clase.aplicatiespital;

public class Medicament {
    private String nume;
    private double pret;

    public Medicament(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public double getPret() {
        return pret;
    }

    public void achizitioneazaMedicament(){
        if(this.prezintaReteta()){
            System.out.println("Achizitioneaza medicament spital ");
        }
        else {
            System.out.println("Pentru acest medicament este nevoie de reteta ");
        }
    }

    public boolean prezintaReteta(){
        return this.nume.startsWith("KA");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medicament{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
