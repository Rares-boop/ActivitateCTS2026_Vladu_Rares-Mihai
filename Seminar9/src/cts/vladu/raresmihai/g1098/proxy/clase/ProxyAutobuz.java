package cts.vladu.raresmihai.g1098.proxy.clase;

public class ProxyAutobuz implements MijlocDeTransport{
    private MijlocDeTransport autobuz;

    public ProxyAutobuz(MijlocDeTransport autobuz) {
        this.autobuz = autobuz;
    }

    @Override
    public void opresteStatie(Statie statie) {
        if(statie.getNrCalatori() > 0 || this.autobuz.getNrCalatoriAutobuz() >0){
            this.autobuz.opresteStatie(statie);
        }
        else{
            System.out.println("Autobuz nu a oprit in statia " + statie.getNume());
        }
    }

    @Override
    public int getNrCalatoriAutobuz() {
        return this.autobuz.getNrCalatoriAutobuz();
    }

    @Override
    public TipCursa getTipCursa() {
        return this.autobuz.getTipCursa();
    }
}
