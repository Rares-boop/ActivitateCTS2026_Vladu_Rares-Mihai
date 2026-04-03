package cts.vladu.raresmihai.g1098.simplefactory.model;

public class MasinaFactory {
    public static AMasina createInstance(TipMasina type, String model, int nrRoti, double inaltime){
        switch (type){
            case SUV -> {
                return new SUV(model, nrRoti, inaltime);
            }
            case VAN -> {
                return new VAN(model, nrRoti, inaltime);
            }
            case SEDAN -> {
                return new SEDAN(model, nrRoti, inaltime);
            }
            default -> throw new RuntimeException("Invalid masina type");
        }
    }
}
