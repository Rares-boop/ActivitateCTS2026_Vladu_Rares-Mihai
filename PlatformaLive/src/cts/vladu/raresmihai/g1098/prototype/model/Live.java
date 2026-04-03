package cts.vladu.raresmihai.g1098.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class Live implements ILive{
    private String nume;
    private int nrUtilizatori;
    private int durata;
    private List<String> comentarii;

    private Live() {
        this.comentarii = new ArrayList<>();
    }

    public Live(String nume, int nrUtilizatori, int durata, List<String> comentarii) {
        this.nume = nume;
        if(nrUtilizatori < 0 || nrUtilizatori > 100) {
            this.nrUtilizatori = 70;
        }
        else{
            this.nrUtilizatori = nrUtilizatori;
        }
        if(durata < 0 || durata > 300){
            this.durata = 150;
        }
        else{
            this.durata = durata;
        }
        this.comentarii = comentarii;
    }

    public void adaugaComentariu(String comentariu){
        this.comentarii.add(comentariu);
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrUtilizatori(int nrUtilizatori) {
        if(nrUtilizatori < 0 || nrUtilizatori > 100) {
            this.nrUtilizatori = 70;
        }
        else{
            this.nrUtilizatori = nrUtilizatori;
        }
    }

    public void setDurata(int durata) {
        if(durata < 0 || durata > 300){
            this.durata = 150;
        }
        else{
            this.durata = durata;
        }
    }

    public void setComentarii(List<String> comentarii) {
        this.comentarii = comentarii;
    }

    @Override
    public ILive cloneaza() {
        Live newLive = new Live();
        newLive.nume = this.nume;
        newLive.nrUtilizatori = this.nrUtilizatori;
        newLive.durata = this.durata;
        newLive.comentarii = new ArrayList<>(this.comentarii);

        return newLive;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Live{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrUtilizatori=").append(nrUtilizatori);
        sb.append(", durata=").append(durata);
        sb.append(", comentarii=").append(comentarii);
        sb.append('}');

        System.out.println(sb.toString());
    }
}
