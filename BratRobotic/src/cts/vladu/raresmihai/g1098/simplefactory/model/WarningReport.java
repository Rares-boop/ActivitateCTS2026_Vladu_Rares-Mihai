package cts.vladu.raresmihai.g1098.simplefactory.model;

public class WarningReport implements TestReport{
    private int idRaport;
    private String numeRobot;

    public WarningReport(int idRaport, String numeRobot) {
        this.idRaport = idRaport;
        this.numeRobot = numeRobot;
    }

    @Override
    public void afiseazaDetaliiRaport() {
        final StringBuilder sb = new StringBuilder("WarningReport{");
        sb.append("idRaport=").append(idRaport);
        sb.append(", numeRobot='").append(numeRobot).append('\'');
        sb.append('}');

        System.out.println(sb.toString());
    }
}
