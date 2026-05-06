package cts.vladu.raresmihai.g1098.command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<>();
    }

    public void adaugaComanda(Command comanda){
        this.comenzi.add(comanda);
    }

    public void executaComanda(){
        if(this.comenzi.size() > 0) {
            this.comenzi.getFirst().plecareInCursa();
            this.comenzi.removeFirst();
        }
    }
}
