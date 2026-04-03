package cts.vladu.raresmihai.g1098.singleton.model;

public class ConexiuneSenzorPerimetral implements RoboticArmConnection{
    private String macAddress;
    private int idSetare;

    private static volatile ConexiuneSenzorPerimetral conexiuneSenzorPerimetral = null;

    private ConexiuneSenzorPerimetral() {
    }

    private ConexiuneSenzorPerimetral(String macAddress, int idSetare) {
        this.macAddress = macAddress;
        this.idSetare = idSetare;
    }

    public static synchronized ConexiuneSenzorPerimetral getInstance(String macAddress,
                                                                     int idSetare){
        if(conexiuneSenzorPerimetral == null){
            conexiuneSenzorPerimetral  = new ConexiuneSenzorPerimetral(macAddress, idSetare);
        }
        return conexiuneSenzorPerimetral;
    }

    @Override
    public void afiseazaDetaliiConexiune() {
        final StringBuilder sb = new StringBuilder("ConexiuneSenzorPerimetral{");
        sb.append("macAddress='").append(macAddress).append('\'');
        sb.append(", idSetare=").append(idSetare);
        sb.append('}');

        System.out.println(sb.toString());
    }
}
