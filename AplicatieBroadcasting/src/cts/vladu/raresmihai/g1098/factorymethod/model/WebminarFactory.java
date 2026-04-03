package cts.vladu.raresmihai.g1098.factorymethod.model;

public class WebminarFactory implements AbstractEventFactory{
    @Override
    public IEvent createEvent(String titlu, String descriere) {
        return new Webminar(titlu, descriere);
    }
}
