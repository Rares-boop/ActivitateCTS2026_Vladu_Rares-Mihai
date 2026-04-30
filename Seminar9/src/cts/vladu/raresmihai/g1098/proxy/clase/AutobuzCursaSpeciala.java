package cts.vladu.raresmihai.g1098.proxy.clase;

public class AutobuzCursaSpeciala implements MijlocDeTransport{
    private MijlocDeTransport autobuzCursaSpeciala;

    public AutobuzCursaSpeciala(MijlocDeTransport autobuzCursaSpeciala) {
        this.autobuzCursaSpeciala = autobuzCursaSpeciala;
    }

    @Override
    public void opresteStatie(Statie statie) {
        if(this.autobuzCursaSpeciala.getTipCursa() == TipCursa.CURSA_NORMALA){
            System.out.println("Autobuzul opreste in statia " + statie.getNume());
        }
        else{
            System.out.println("Autobuzul este la petrecere acum ");
        }
    }

    @Override
    public int getNrCalatoriAutobuz() {
        return 0;
    }

    @Override
    public TipCursa getTipCursa() {
        return null;
    }
}
