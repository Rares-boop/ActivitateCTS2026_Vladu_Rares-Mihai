package cts.vladu.raresmihai.g1098.factorymethod.model;

public class BaraFactory implements AbstractFactoryComponenta{

    @Override
    public IComponenta getComponenta(double valoare) {
        return new Bara("Default");
    }

    @Override
    public IComponenta getComponenta(String codCuloare) {
        return new Bara(codCuloare);
    }
}
