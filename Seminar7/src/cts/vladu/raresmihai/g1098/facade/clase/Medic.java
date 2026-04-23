package cts.vladu.raresmihai.g1098.facade.clase;

public class Medic {
    public boolean areTrimitere(Pacient pacient){
        return pacient.getGravitate() > 5;
    }
}
