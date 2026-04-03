package cts.vladu.raresmihai.g1098.factorymethod.model;

public class PortbagajFactory implements AbstractFactoryComponenta{

    @Override
    public IComponenta getComponenta(double valoare) {
        return new Portbagaj(valoare);
    }

    @Override
    public IComponenta getComponenta(String codCuloare) {
        return new Portbagaj(50);
    }
}
