package cts.vladu.raresmihai.g1098.simplefactory.model;

public class SuccessReport implements TestReport{
    int idRaport;
    String numeRobot;

    public SuccessReport(int idRaport, String numeRobot) {
        this.idRaport = idRaport;
        this.numeRobot = numeRobot;
    }

    @Override
    public void afiseazaDetaliiRaport() {
        final StringBuilder sb = new StringBuilder("SuccessReport{");
        sb.append("idRaport=").append(idRaport);
        sb.append(", numeRobot='").append(numeRobot).append('\'');
        sb.append('}');

        System.out.println(sb.toString());
    }
}
