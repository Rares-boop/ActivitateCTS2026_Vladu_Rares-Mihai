package ro.ase.cts.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Observabil {
    private List<Observer> pacienti;

    public Observabil(List<Observer> pacienti) {
        this.pacienti = pacienti;
    }

    public Observabil() {
        this.pacienti = new ArrayList<>();
    }

    public void abonareObservator(Observer pacient){
        this.pacienti.add(pacient);
    }

    public void dezabonareObservator(Observer pacient){
        this.pacienti.remove(pacient);
    }

    public void notificareObservatori(){
        for(Observer pacient : pacienti){
            pacient.notificare();
        }
    }
}
