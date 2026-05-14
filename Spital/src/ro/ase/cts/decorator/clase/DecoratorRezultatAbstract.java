package ro.ase.cts.decorator.clase;

public abstract class DecoratorRezultatAbstract implements RezultatAbstract{
    private RezultatAbstract rezultat;

    public DecoratorRezultatAbstract(RezultatAbstract rezultat) {
        this.rezultat = rezultat;
    }

    @Override
    public void printeaza() {
        this.rezultat.printeaza();
    }

}
