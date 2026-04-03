package cts.vladu.raresmihai.g1098.factorymethod.model;

public class CapotaFactory implements AbstractFactoryComponenta{

    @Override
    public IComponenta getComponenta(double valoare) {
        return new Capota(valoare);
    }

    @Override
    public IComponenta getComponenta(String codCuloare) {
        return new Capota(1000);
    }
}
