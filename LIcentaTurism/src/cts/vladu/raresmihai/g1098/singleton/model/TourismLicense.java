package cts.vladu.raresmihai.g1098.singleton.model;

public class TourismLicense implements AbstractToursimLicense{
    private int id;
    private String nume;
    private String data;
    private static volatile TourismLicense tourismLicense = null;

    private TourismLicense() {
    }

    private TourismLicense(int id, String nume, String data) {
        this.id = id;
        this.nume = nume;
        this.data = data;
    }

    public static synchronized TourismLicense setLicenseNumber(int id, String nume, String data){
        if(tourismLicense != null){
            throw new RuntimeException("Licenta already set");
        }
        tourismLicense = new TourismLicense(id, nume, data);
        return tourismLicense;
    }

    public static TourismLicense getInstance(){
        if(tourismLicense == null) {
            throw new RuntimeException("Licenta is not set ");
        }
        return tourismLicense;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("TourismLicense{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", data='").append(data).append('\'');
        sb.append('}');
        System.out.println(sb.toString());
    }
}
