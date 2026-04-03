package cts.vladu.raresmihai.g1098.singleton.main;

import cts.vladu.raresmihai.g1098.singleton.model.ConexiuneInternet;
import cts.vladu.raresmihai.g1098.singleton.model.ConexiuneSenzorPerimetral;
import cts.vladu.raresmihai.g1098.singleton.model.ConexiuneSenzorTemperatura;
import cts.vladu.raresmihai.g1098.singleton.model.RoboticArmConnection;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        RoboticArmConnection conxiuneInternet = ConexiuneInternet.getInstance("192.168.1.132");
        RoboticArmConnection conxiuneSenzorTemperatura = ConexiuneSenzorTemperatura.getInstance("2d:54:26:fa:ae:aa");

        RoboticArmConnection conexiuneSenzorPerimetral  = ConexiuneSenzorPerimetral.getInstance("22:22:22:22:22:22", 5);
        RoboticArmConnection conexiuneInternet1 = ConexiuneInternet.getInstance("255.255.255.255");

        conxiuneInternet.afiseazaDetaliiConexiune();
        conxiuneSenzorTemperatura.afiseazaDetaliiConexiune();

        conexiuneSenzorPerimetral.afiseazaDetaliiConexiune();
        conexiuneInternet1.afiseazaDetaliiConexiune();

    }
}
