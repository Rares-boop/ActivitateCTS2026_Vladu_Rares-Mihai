package cts.vladu.raresmihai.g1098.builder.model;

public class HolidayPackage implements AbstractHolidayPackage{
    private String transport;
    private String cazare;
    private boolean areExcursiiGrup;
    private boolean areViziteMuzee;
    private boolean areMicDejun;

    public HolidayPackage(String transport, String cazare, boolean areExcursiiGrup,
                          boolean areViziteMuzee, boolean areMicDejun) {
        this.transport = transport;
        this.cazare = cazare;
        this.areExcursiiGrup = areExcursiiGrup;
        this.areViziteMuzee = areViziteMuzee;
        this.areMicDejun = areMicDejun;
    }

    @Override
    public void afiseazaDetaliiPachet() {
        final StringBuilder sb = new StringBuilder("HolidayPackage{");
        sb.append("transport='").append(transport).append('\'');
        sb.append(", cazare='").append(cazare).append('\'');
        sb.append(", areExcursiiGrup=").append(areExcursiiGrup);
        sb.append(", areViziteMuzee=").append(areViziteMuzee);
        sb.append(", areMicDejun=").append(areMicDejun);
        sb.append('}');

        System.out.println(sb.toString());
    }
}
