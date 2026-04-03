package cts.vladu.raresmihai.g1098.factorymethod.model;

public class HandbalFactory implements AbstractSportFactory{

    @Override
    public Sport getSport(String nume, String numeEchipaGazda, String numeEchipaOaspete) {
        return new Handbal(nume, numeEchipaGazda, numeEchipaOaspete);
    }
}
