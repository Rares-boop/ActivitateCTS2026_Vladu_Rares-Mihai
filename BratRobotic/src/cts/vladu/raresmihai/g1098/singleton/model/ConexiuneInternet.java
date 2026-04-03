package cts.vladu.raresmihai.g1098.singleton.model;

public class ConexiuneInternet implements RoboticArmConnection{
    private String adresaIp;
    private static volatile ConexiuneInternet conexiuneInternet = null;

    private ConexiuneInternet() {
    }

    private ConexiuneInternet(String adresaIp) {
        this.adresaIp = adresaIp;
    }

    public synchronized static ConexiuneInternet getInstance(String adresaIp){
        if(conexiuneInternet == null){
            conexiuneInternet = new ConexiuneInternet(adresaIp);
        }
        return conexiuneInternet;
    }

    @Override
    public void afiseazaDetaliiConexiune() {
        final StringBuilder sb = new StringBuilder("ConexiuneInternet{");
        sb.append("adresaIp='").append(adresaIp).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
