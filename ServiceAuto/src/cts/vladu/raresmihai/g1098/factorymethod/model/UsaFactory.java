package cts.vladu.raresmihai.g1098.factorymethod.model;

public class UsaFactory implements AbstractFactoryComponenta{
    @Override
    public IComponenta getComponenta(double valoare) {
        return new Usa(valoare);
    }

    @Override
    public IComponenta getComponenta(String codCuloare) {
        return new Usa(500);
    }
}
