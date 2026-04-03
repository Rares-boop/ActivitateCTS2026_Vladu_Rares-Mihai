package cts.vladu.raresmihai.g1098.factorymethod.model;

public class BaschetFactory implements AbstractSportFactory{

    @Override
    public Sport getSport(String nume, String numeEchipaGazda, String numeEchipaOaspete) {
        return new Baschet(nume, numeEchipaGazda, numeEchipaOaspete);
    }
}
