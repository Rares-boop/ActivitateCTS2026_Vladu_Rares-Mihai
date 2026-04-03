package cts.vladu.raresmihai.g1098.factorymethod.model;

public class CapotaFactory implements AbstractComponentaFactory{

    @Override
    public IComponenta getComponenta(int id, String nume) {
        return new Capota(id, nume);
    }
}
