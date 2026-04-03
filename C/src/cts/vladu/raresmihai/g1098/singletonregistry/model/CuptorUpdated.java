package cts.vladu.raresmihai.g1098.singletonregistry.model;

import java.util.ArrayList;
import java.util.List;

public class CuptorUpdated {
    private int id;
    private int gradeMaxime;
    private List<Preparat> listaAsteptare;

    private CuptorUpdated() {
    }

    CuptorUpdated(int id, int gradeMaxime) {
        this.id = id;
        this.gradeMaxime = gradeMaxime;
        this.listaAsteptare = new ArrayList<>();
    }

    public void adaugaComanda(Preparat preparat){
        this.listaAsteptare.add(preparat);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cuptor{");
        sb.append("id=").append(id);
        sb.append(", gradeMaxime=").append(gradeMaxime);
        sb.append(", listaAsteptare=").append(listaAsteptare);
        sb.append('}');
        return sb.toString();
    }
}
