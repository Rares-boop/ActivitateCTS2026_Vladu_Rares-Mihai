package cts.vladu.raresmihai.g1098.simplefactory.model;

public class ErrorReport implements TestReport{
    private int idRaport;
    private String numeRobot;

    public ErrorReport(int idRaport, String numeRobot) {
        this.idRaport = idRaport;
        this.numeRobot = numeRobot;
    }

    @Override
    public void afiseazaDetaliiRaport() {
        final StringBuilder sb = new StringBuilder("ErrorReport{");
        sb.append("idRaport=").append(idRaport);
        sb.append(", numeRobot='").append(numeRobot).append('\'');
        sb.append('}');

        System.out.println(sb.toString());
    }
}
