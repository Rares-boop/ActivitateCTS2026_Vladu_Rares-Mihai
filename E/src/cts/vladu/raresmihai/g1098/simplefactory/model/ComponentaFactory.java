package cts.vladu.raresmihai.g1098.simplefactory.model;

public class ComponentaFactory {
    public static IComponenta getComponenta(TipComponenta type, int id, String nume){
        switch (type){
            case USA -> {
                return new Usa(id, nume);
            }
            case CAPOTA -> {
                return new Capota(id, nume);
            }
            case BARA -> {
                return new Bara(id, nume);
            }
            case PORTBAGAJ -> {
                return new Portbagaj(id, nume);
            }
            default -> throw new RuntimeException("Invalid componenta type ");
        }
    }
}
