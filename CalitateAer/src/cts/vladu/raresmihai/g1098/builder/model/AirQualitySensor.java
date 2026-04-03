package cts.vladu.raresmihai.g1098.builder.model;

public class AirQualitySensor implements AbstractAirQualitySensor{
    private int id;
    private boolean arePm;
    private boolean arePm10;
    private boolean areVoc;
    private boolean areCo2;
    private boolean areCo;

    public AirQualitySensor(int id, boolean arePm, boolean arePm10, boolean areVoc,
                            boolean areCo2, boolean areCo) {
        this.id = id;
        this.arePm = arePm;
        this.arePm10 = arePm10;
        this.areVoc = areVoc;
        this.areCo2 = areCo2;
        this.areCo = areCo;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("AirQualitySensor{");
        sb.append("id=").append(id);
        sb.append(", arePm=").append(arePm);
        sb.append(", arePm10=").append(arePm10);
        sb.append(", areVoc=").append(areVoc);
        sb.append(", areCo2=").append(areCo2);
        sb.append(", areCo=").append(areCo);
        sb.append('}');

        System.out.println(sb.toString());
    }
}
