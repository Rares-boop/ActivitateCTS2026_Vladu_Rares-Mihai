package cts.vladu.raresmihai.g1098.chain.model;

public class CalatorieAutobuz extends CalatorieHandler{

    @Override
    public String recomandaCalatorie(double distanta) {
        if(distanta < 5){
            return "Autobuz";
        }

        return super.succesor.recomandaCalatorie(distanta);
    }
}
