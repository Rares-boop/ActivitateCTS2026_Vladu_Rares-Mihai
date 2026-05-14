package cts.vladu.raresmihai.g1098.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocTransport {
    protected List<Calator> calatori;
    protected String linie;

    public MijlocTransport(String linie) {
        this.calatori = new ArrayList<>();
        this.linie = linie;
    }

    public void abonareObservator(Calator calator){
        this.calatori.add(calator);
    }

    public void dezabonareObservator(Calator calator){
        this.calatori.remove(calator);
    }

    public void notificareObservatori(String mesaj){
        for(Calator calator : this.calatori){
            calator.notificare(this.linie, mesaj);
        }
    }

    public abstract void plecareDepou();

    public abstract void ramaneBlocat();
}
