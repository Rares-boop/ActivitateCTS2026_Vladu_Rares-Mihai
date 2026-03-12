package ro.ase.cts.singleton;

public class Hotel {
    private String nume;
    private int nrCamere;
    private int nrCamereOcupate;
    private static Hotel instance = null;

    private Hotel(String nume, int nrCamere, int nrCamereOcupate){
        this.nume = nume;
        this.nrCamere =nrCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    public static synchronized Hotel getInstance(String nume, int nrCamere, int nrCamereOcupate){
        if(instance == null){
            instance = new Hotel(nume, nrCamere, nrCamereOcupate);
        }
        return instance;
    }

    public void rezervaCamera(){
        if(this.nrCamereOcupate < this.nrCamere){
            this.nrCamereOcupate++;
            System.out.println("Camera ocupata ");
        }
        else{
            System.out.println("Camerele sunt pline ");
        }
    }

    public void afiseazaDetaliiHotel() {
        final StringBuilder sb = new StringBuilder("Hotel{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrCamere=").append(nrCamere);
        sb.append(", nrCamereOcupate=").append(nrCamereOcupate);
        sb.append('}');

        System.out.println(sb.toString());
    }

    public void elibereazaCamera(){
        if(this.nrCamereOcupate > 0){
            System.out.println("Camera eliberata");
            this.nrCamereOcupate--;
        }
        else{
            System.out.println("Nu mai exista camere de eliberat");
        }
    }

    public void afiseazaGradDeOcupare(){
        System.out.println("Grad de ocupare " + (double) this.nrCamereOcupate / this.nrCamere);
    }
}


