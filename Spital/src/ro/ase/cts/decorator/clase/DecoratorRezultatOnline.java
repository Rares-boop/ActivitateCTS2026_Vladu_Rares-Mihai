package ro.ase.cts.decorator.clase;

public class DecoratorRezultatOnline extends DecoratorRezultatAbstract{

    public DecoratorRezultatOnline(RezultatAbstract rezultat) {
        super(rezultat);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        this.trimiteOnline();
    }

    public void trimiteOnline(){
        System.out.println("Rezultatul analizei este trimis online ");
    }
}
