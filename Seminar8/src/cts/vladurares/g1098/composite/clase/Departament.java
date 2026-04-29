package cts.vladurares.g1098.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura{
    private String numeDepartament;
    private List<Structura> structuri;

    public Departament(String numeDepartament) {
        this.numeDepartament = numeDepartament;
        this.structuri = new ArrayList<>();
    }

    public void adaugaStructura(Structura structura){
        this.structuri.add(structura);
    }

    public void stergeStructura(Structura structura){
        this.structuri.remove(structura);
    }

    public Structura getStructura(int index){
        return this.structuri.get(index);
    }

    @Override
    public void printeazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Departament " + this.numeDepartament);
        for(Structura structura : structuri){
            structura.printeazaDetaliiStructura("   ");
        }
    }
}
