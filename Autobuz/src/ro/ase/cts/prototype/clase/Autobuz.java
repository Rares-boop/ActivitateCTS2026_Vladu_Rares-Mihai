package ro.ase.cts.prototype.clase;

public class Autobuz implements MijlocTransport {
    private int nrRoti;
    private int nrLocuri;
    private double pretCalatorie;
    private String cod;

    private Autobuz() {
    }

    public Autobuz(int nrRoti, int nrLocuri, double pretCalatorie, String cod) {
        if(nrRoti < 4 || nrRoti > 6){
            this.nrRoti = 4;
        }
        else{
            this.nrRoti = nrRoti;
        }
        if(this.nrLocuri < 20 || this.nrLocuri > 60){
            this.nrLocuri = 30;
        }
        else{
            this.nrLocuri = nrLocuri;
        }
        if(pretCalatorie <= 0){
            this.pretCalatorie = 5;
        }
        else{
            this.pretCalatorie = pretCalatorie;
        }
        if(cod.length() < 3){
            this.cod = "ABC";
        }
        else{
            this.cod = cod;
        }
    }

    public void setPretCalatorie(double pretCalatorie) {
        if (pretCalatorie <= 0){
            throw new RuntimeException("Invalid price ");
        }
        this.pretCalatorie = pretCalatorie;
    }

    public void setCod(String cod) {
        if(cod.length() < 3){
            throw new RuntimeException("Invalid code for bus ");
        }
        this.cod = cod;
    }

    @Override
    public MijlocTransport cloneaza() {
        Autobuz autobuzNou = new Autobuz();
        autobuzNou.nrRoti = this.nrRoti;
        autobuzNou.nrLocuri = this.nrLocuri;
        autobuzNou.pretCalatorie = this.pretCalatorie;
        autobuzNou.cod = this.cod;

        return autobuzNou;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("nrRoti=").append(nrRoti);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append(", pretCalatorie=").append(pretCalatorie);
        sb.append(", cod='").append(cod).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
