package cts.vladu.raresmihai.g1098.simplefactory.model;

public class PersonalFactory {
    public static IPersonal createPersonal(TipPersonal type, String nume, String valoare){
        switch (type){
            case MEDIC -> {
                return new Medic(nume, valoare);
            }
            case ASISTENT -> {
                return new Asistent(nume, 5000);
            }
            case SECRETAR -> {
                return new Secretar(nume, valoare);
            }
            default -> throw new RuntimeException("Invalid personal type");
        }
    }
    public static IPersonal createPersonal(TipPersonal type, String nume, double salariu){
        switch (type){
            case MEDIC -> {
                return new Medic(nume, "Salut ");
            }
            case ASISTENT -> {
                return new Asistent(nume, salariu);
            }
            case SECRETAR -> {
                return new Secretar(nume, "Ok ");
            }
            default -> throw new RuntimeException("Invalid personal type");
        }
    }
}
