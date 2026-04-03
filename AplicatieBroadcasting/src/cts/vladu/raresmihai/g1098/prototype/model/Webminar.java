package cts.vladu.raresmihai.g1098.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class Webminar implements IWebminar {
    private String titlu;
    private String descriere;
    private List<String> listaComentarii;
    private int nrVizitatori;

    public Webminar() {
        this.listaComentarii = new ArrayList<>();
    }

    public Webminar(String titlu, String descriere, List<String> listaComentarii, int nrVizitatori) {
        if(titlu.length() < 3 || titlu.length() > 20){
            this.titlu = "Default";
        }
        else{
            this.titlu = titlu;
        }
        this.descriere = descriere;
        this.listaComentarii = listaComentarii;
        if(nrVizitatori < 0){
            this.nrVizitatori = 100;
        }
        else{
            this.nrVizitatori = nrVizitatori;
        }
    }

    public void setTitlu(String titlu) {
        if(titlu.length() < 3 || titlu.length() > 20){
            this.titlu = "Default";
        }
        else{
            this.titlu = titlu;
        }
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public void setListaComentarii(List<String> listaComentarii) {
        this.listaComentarii = listaComentarii;
    }

    public void setNrVizitatori(int nrVizitatori) {
        if(nrVizitatori < 0){
            this.nrVizitatori = 100;
        }
        else{
            this.nrVizitatori = nrVizitatori;
        }
    }

    public void adaugaComentariu(String comentariu){
        this.listaComentarii.add(comentariu);
    }

    @Override
    public Webminar cloneazaWebminar() {
        Webminar newWebminar = new Webminar();
        newWebminar.titlu = this.titlu;
        newWebminar.descriere = this.descriere;
        newWebminar.listaComentarii = new ArrayList<>(this.listaComentarii);
        newWebminar.nrVizitatori = this.nrVizitatori;

        return newWebminar;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Webminar{");
        sb.append("titlu='").append(titlu).append('\'');
        sb.append(", descriere='").append(descriere).append('\'');
        sb.append(", listaComentarii=").append(listaComentarii);
        sb.append(", nrVizitatori=").append(nrVizitatori);
        sb.append('}');
        return sb.toString();
    }
}
