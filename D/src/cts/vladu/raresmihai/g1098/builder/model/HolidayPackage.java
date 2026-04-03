package cts.vladu.raresmihai.g1098.builder.model;

public class HolidayPackage implements AbstractHolidayPackage{
    private boolean areTransport;
    private String modalitateTransport;
    private boolean areCazare;
    private int nrStele;

    HolidayPackage() {
    }

    HolidayPackage(boolean areTransport, String modalitateTransport,
                          boolean areCazare, int nrStele) {
        this.areTransport = areTransport;
        this.modalitateTransport = modalitateTransport;
        this.areCazare = areCazare;
        this.nrStele = nrStele;
    }

    public void setAreTransport(boolean areTransport) {
        this.areTransport = areTransport;
    }

    public void setModalitateTransport(String modalitateTransport) {
        this.modalitateTransport = modalitateTransport;
    }

    public void setAreCazare(boolean areCazare) {
        this.areCazare = areCazare;
    }

    public void setNrStele(int nrStele) {
        this.nrStele = nrStele;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("HolidayPackage{");
        sb.append("areTransport=").append(areTransport);
        sb.append(", modalitateTransport='").append(modalitateTransport).append('\'');
        sb.append(", areCazare=").append(areCazare);
        sb.append(", nrStele=").append(nrStele);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
