package cts.vladu.raresmihai.g1098.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements DepartamentAbstarct {
    private String nume;
    private List<DepartamentAbstarct> listaDepartamente;

    public Departament(String nume) {
        this.nume = nume;
        this.listaDepartamente = new ArrayList<>();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Departament{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", listaDepartamente=").append(listaDepartamente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Departament " + this.nume);
        for(DepartamentAbstarct departamentAbstarct : listaDepartamente){
            departamentAbstarct.afiseazaDetalii();
        }
    }

    @Override
    public void adaugaNod(DepartamentAbstarct nod) {
        this.listaDepartamente.add(nod);
    }

    @Override
    public void stergeNod(DepartamentAbstarct nod) {
        this.listaDepartamente.remove(nod);
    }

    @Override
    public DepartamentAbstarct getNodCopil(int index) {
        return this.listaDepartamente.get(index);
    }
}
