package cts.vladu.raresmihai.g1098.factorymethod.model;

public class BaraFactory implements AbstractComponentaFactory{

    @Override
    public IComponenta getComponenta(int id, String nume) {
        return new Bara(id, nume);
    }
}
