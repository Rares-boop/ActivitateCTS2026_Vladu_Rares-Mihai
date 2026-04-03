package cts.vladu.raresmihai.g1098.singleton.model;

public class TourismLicense implements AbstractTourismLicense{
    private String nume;
    private int licenseNumber;
    private boolean isSet = false;
    private static volatile TourismLicense tourismLicense = null;

    private TourismLicense() {
    }

    private TourismLicense(String nume) {
        this.nume = nume;
    }

    public static synchronized AbstractTourismLicense getInstance(String nume, int licenseNumber){
        if(tourismLicense == null){
            tourismLicense = new TourismLicense(nume);
            tourismLicense.setLicenseNumber(licenseNumber);
        }
        return tourismLicense;
    }

    @Override
    public void setLicenseNumber(int licenseNumber) {
        if(isSet){
            throw new RuntimeException("License number already set");
        }
        this.licenseNumber = licenseNumber;
        isSet = true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TourismLicense{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", licenseNumber=").append(licenseNumber);
        sb.append('}');
        return sb.toString();
    }
}
