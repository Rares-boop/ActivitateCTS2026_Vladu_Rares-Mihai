package cts.vladu.raresmihai.g1098.testareunitara;

public class CalatorAbonat implements Calator{
    private String nume;
    private double sold;

    public CalatorAbonat(String nume) {
        this.nume = nume;
    }

    public void platesteBilet(double pret){
        if(this.sold >= pret){
            System.out.println("Calator " + this.nume + " plateste " + pret + " pentru calatorie ");
            this.sold = this.sold - pret;
        }
        else{
            System.out.println("Sold insuficient ");
        }
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    @Override
    public void notificare(String linie, String mesaj) {
        System.out.println("Calator " + this.nume + " autobuzul de pe linia " + linie + " mesaj " + mesaj);
    }
}

