package cts.vladu.raresmihai.g1098.singleton.model;

public class ConexiuneSenzorTemperatura implements RoboticArmConnection{
    private String macAddress;
    private static volatile ConexiuneSenzorTemperatura conexiuneSenzorTemperatura = null;

    private ConexiuneSenzorTemperatura() {
    }

    private ConexiuneSenzorTemperatura(String macAddress) {
        this.macAddress = macAddress;
    }

    public static synchronized ConexiuneSenzorTemperatura getInstance(String macAddress){
        if(conexiuneSenzorTemperatura == null){
            conexiuneSenzorTemperatura = new ConexiuneSenzorTemperatura(macAddress);
        }
        return conexiuneSenzorTemperatura;
    }

    @Override
    public void afiseazaDetaliiConexiune() {
        final StringBuilder sb = new StringBuilder("ConexiuneSenzorTemperatura{");
        sb.append("macAddress='").append(macAddress).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
