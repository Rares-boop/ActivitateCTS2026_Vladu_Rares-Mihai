package cts.vladu.raresmihai.g1098.factorymethod.model;

public class FotbalFactory implements AbstractSportFactory{

    @Override
    public Sport getSport(String nume, String numeEchipaGazda, String numeEchipaOaspete) {
        return new Fotbal(nume, numeEchipaGazda, numeEchipaOaspete);
    }
}
