package cts.vladu.raresmihai.g1098.factorymethod.model;

public class UsaFactory implements AbstractComponentaFactory{

    @Override
    public IComponenta getComponenta(int id, String nume) {
        return new Usa(id, nume);
    }
}
