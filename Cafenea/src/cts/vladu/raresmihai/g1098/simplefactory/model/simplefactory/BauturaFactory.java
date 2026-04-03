package cts.vladu.raresmihai.g1098.simplefactory.model.simplefactory;

public class BauturaFactory {
    public Bautura createBautura(TipBautura type, String nume, double volum, double pret){
        switch (type){
            case CEAI -> {
                return new Ceai(nume, volum, pret);
            }
            case CAFEA -> {
                return new Cafea(nume, volum, pret);
            }
            case CIOCOLATA_CALDA -> {
                return new CiocolataCalda(nume, volum, pret);
            }
            default -> throw new RuntimeException("Invalid type");
        }
    }
}
