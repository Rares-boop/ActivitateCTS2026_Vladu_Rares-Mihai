package cts.vladu.raresmihai.g1098.factorymethod.model;

public class WorkshopFactory implements AbstractEventFactory{
    @Override
    public IEvent createEvent(String titlu, String descriere) {
        return new Workshop(titlu, descriere);
    }
}
