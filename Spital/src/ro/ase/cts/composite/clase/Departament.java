package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String nume;
    private List<Structura> structuri;

    public Departament(String nume) {
        this.nume = nume;
        this.structuri = new ArrayList<>();
    }

    @Override
    public void printeaza() {
        System.out.println("Departement " + this.nume);
        for(Structura structura : structuri){
            structura.printeaza();
        }
    }

    @Override
    public void adaugaNod(Structura nod) {
        this.structuri.add(nod);
    }

    @Override
    public void stergeNod(Structura nod) {
        this.structuri.remove(nod);
    }

    @Override
    public Structura getNodCopil() {
        if(!this.structuri.isEmpty()) {
            return this.structuri.getFirst();
        }
        else{
            return null;
        }
    }
}
