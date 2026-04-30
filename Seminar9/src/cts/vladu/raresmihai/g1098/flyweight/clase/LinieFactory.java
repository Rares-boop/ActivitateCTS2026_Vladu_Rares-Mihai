package cts.vladu.raresmihai.g1098.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class LinieFactory {
    private Map<Integer, LinieAbstracta> linii = new HashMap<>();

    public LinieAbstracta getLinie(int nrLinie, String primaStatie, String ultimaStatie){
//        if(this.linii.containsKey(nrLinie)){
//            return this.linii.get(nrLinie);
//        }
//        else{
//            return this.linii.put(nrLinie, new Linie(primaStatie ,ultimaStatie, nrLinie));
//        }

        return this.linii.computeIfAbsent(nrLinie, _ -> new Linie(primaStatie, ultimaStatie, nrLinie));
    }
}
