package cts.vladu.raresmihai.g1098.simplefactory.model.simplefactory;

public abstract class BauturaAbstracta {
    protected String nume;
    protected double volum;
    protected double pret;

    public BauturaAbstracta() {
    }

    public BauturaAbstracta(String nume, double volum, double pret) {

        if(nume.length() < 2 || nume.length() > 10){
            this.nume = "Bautura default";
        }
        else{
            this.nume = nume;
        }
        if(volum < 200){
            this.volum =  200;
        }
        else{
            this.volum = volum;
        }
        this.pret = pret;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVolum(double volum) {
        this.volum = volum;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("nume='").append(nume).append('\'');
        sb.append(", volum=").append(volum);
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
