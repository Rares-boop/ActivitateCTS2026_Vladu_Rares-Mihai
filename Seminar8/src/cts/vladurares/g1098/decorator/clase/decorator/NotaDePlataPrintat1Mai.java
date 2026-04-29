package cts.vladurares.g1098.decorator.clase.decorator;

import cts.vladurares.g1098.decorator.clase.NotaDePlataAbstract;

public class NotaDePlataPrintat1Mai extends NotaDePlataDecorator{

    public NotaDePlataPrintat1Mai(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        super.printeaza();
        System.out.println("Este 1 mai in curand ");
    }
}
