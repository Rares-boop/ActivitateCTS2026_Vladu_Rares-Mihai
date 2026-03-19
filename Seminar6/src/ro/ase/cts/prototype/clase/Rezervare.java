package ro.ase.cts.prototype.clase;

public class Rezervare implements RezervareAbstracta{
    private String numeClient;
    private int oraRezervare;
    private String ziua;
    private String nrTelefon;

    private Rezervare() {
    }

    //consuma multe resurse
    public Rezervare(String numeClient, int oraRezervare, String ziua, String nrTelefon) {
        if(numeClient.length() > 3) {
            this.numeClient = numeClient;
        }
        else{
            this.numeClient = "Default";
        }
        if(oraRezervare > 9 && oraRezervare < 23) {
            this.oraRezervare = oraRezervare;
        }
        else{
            this.oraRezervare = 9;
        }
        this.ziua = ziua;
        if(nrTelefon.length() == 10){
            this.nrTelefon = nrTelefon;
        }
        else{
            this.nrTelefon = "0762544244";
        }
    }

    public void setOraRezervare(int oraRezervare) {
        if(oraRezervare < 9 && oraRezervare>23) {
            this.oraRezervare = oraRezervare;
        }
        else{
            this.oraRezervare = 10;
        }
    }

    public void setZiua(String ziua) {
        this.ziua = ziua;
    }

    @Override
    public RezervareAbstracta rezerva() {
        Rezervare newRezervare = new Rezervare();
        newRezervare.numeClient = this.numeClient;
        newRezervare.oraRezervare = this.oraRezervare;
        newRezervare.ziua = this.ziua;
        newRezervare.nrTelefon = nrTelefon;

        return newRezervare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", oraRezervare=").append(oraRezervare);
        sb.append(", ziua='").append(ziua).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

