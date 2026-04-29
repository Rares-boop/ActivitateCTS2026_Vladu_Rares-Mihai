package cts.vladurares.g1098.decorator.clase.decorator;

import cts.vladurares.g1098.decorator.clase.NotaDePlataAbstract;

public class NotaDePlataPrintatNouAn extends NotaDePlataDecorator{

    public NotaDePlataPrintatNouAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        super.printeaza();
        System.out.println("A venit noul an ");
    }
}
