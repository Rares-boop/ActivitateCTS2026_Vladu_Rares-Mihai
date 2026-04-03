package cts.vladu.raresmihai.g1098.factorymethod.model;

public class PortbagajFactory implements AbstractComponentaFactory{

    @Override
    public IComponenta getComponenta(int id, String nume) {
        return new Portbagaj(id, nume);
    }
}
