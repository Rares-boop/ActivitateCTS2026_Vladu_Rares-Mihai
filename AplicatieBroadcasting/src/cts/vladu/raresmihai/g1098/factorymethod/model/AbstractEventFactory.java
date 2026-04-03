package cts.vladu.raresmihai.g1098.factorymethod.model;

public interface AbstractEventFactory {
    IEvent createEvent(String titlu, String descriere);
}
