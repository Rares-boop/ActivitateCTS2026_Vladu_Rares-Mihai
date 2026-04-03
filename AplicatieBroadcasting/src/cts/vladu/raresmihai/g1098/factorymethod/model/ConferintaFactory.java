package cts.vladu.raresmihai.g1098.factorymethod.model;

public class ConferintaFactory implements AbstractEventFactory{
    @Override
    public IEvent createEvent(String titlu, String descriere) {
        return new Conferinta(titlu, descriere);
    }
}
