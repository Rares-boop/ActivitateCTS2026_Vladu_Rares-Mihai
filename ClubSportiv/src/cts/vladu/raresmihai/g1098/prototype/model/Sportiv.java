package cts.vladu.raresmihai.g1098.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class Sportiv implements ISportiv {
    private String nume;
    private int varsta;
    private double salariu;
    private List<String> antrenamente;

    private Sportiv() {
    }

    public Sportiv(String nume, int varsta, double salariu, List<String> antrenamente) {
        if(nume.length() < 3 || nume.length() > 20){
            this.nume = "Default";
        }
        else{
            this.nume = nume;
        }
        if(varsta < 18 || varsta > 40){
            this.varsta = 25;
        }
        else {
            this.varsta = varsta;
        }
        this.salariu = salariu;
        this.antrenamente = antrenamente;
    }

    public void setNume(String nume) {
        if(nume.length() < 3 || nume.length() > 20){
            this.nume = "Default";
        }
        else{
            this.nume = nume;
        }
    }

    public void setVarsta(int varsta) {
        if(varsta < 18 || varsta > 40){
            this.varsta = 25;
        }
        else {
            this.varsta = varsta;
        }
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public void setAntrenamente(List<String> antrenamente) {
        this.antrenamente = antrenamente;
    }

    public void adaugaAntrenament(String antrenament){
        this.antrenamente.add(antrenament);
    }

    @Override
    public ISportiv cloneaza() {
        Sportiv newSportiv = new Sportiv();
        newSportiv.nume = this.nume;
        newSportiv.varsta = this.varsta;
        newSportiv.salariu = this.salariu;
        newSportiv.antrenamente = new ArrayList<>(this.antrenamente);

        return newSportiv;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Sportiv{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append(", salariu=").append(salariu);
        sb.append(", antrenamente=").append(antrenamente);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
