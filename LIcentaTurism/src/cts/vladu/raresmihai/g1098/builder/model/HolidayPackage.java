package cts.vladu.raresmihai.g1098.builder.model;

public class HolidayPackage implements AbstractHolidayPackage{
    private boolean areTransport;
    private String modalitateTransport;
    private boolean areCazare;
    private int durata;
    private boolean areExcursiiGrup;

    private HolidayPackage(boolean areTransport, String modalitateTransport,
                          boolean areCazare, int durata, boolean areExcursiiGrup) {
        this.areTransport = areTransport;
        this.modalitateTransport = modalitateTransport;
        this.areCazare = areCazare;
        this.durata = durata;
        this.areExcursiiGrup = areExcursiiGrup;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("HolidayPackage{");
        sb.append("areTransport=").append(areTransport);
        sb.append(", modalitateTransport='").append(modalitateTransport).append('\'');
        sb.append(", areCazare=").append(areCazare);
        sb.append(", durata=").append(durata);
        sb.append(", areExcursiiGrup=").append(areExcursiiGrup);
        sb.append('}');
        System.out.println(sb.toString());
    }

    public static class HolidayPackageBuilder implements AbstractHolidayPackageBuilder{
        private boolean areTransport;
        private String modalitateTransport;
        private boolean areCazare;
        private int durata;
        private boolean areExcursiiGrup;

        public HolidayPackageBuilder() {
            this.areTransport = false;
            this.modalitateTransport = "Default ";
            this.areCazare = false;
            this.durata = 0;
            this.areExcursiiGrup = false;
        }

        @Override
        public HolidayPackage build() {
            return new HolidayPackage(this.areTransport, this.modalitateTransport, this.areCazare,
                    this.durata, this.areExcursiiGrup);
        }

        @Override
        public AbstractHolidayPackageBuilder setAreTransport(boolean areTransport) {
            this.areTransport = areTransport;
            return this;
        }

        @Override
        public AbstractHolidayPackageBuilder setModalitateTransport(String modalitateTransport) {
            this.modalitateTransport = modalitateTransport;
            return this;
        }

        @Override
        public AbstractHolidayPackageBuilder setAreCazare(boolean areCazare) {
            this.areCazare = areCazare;
            return this;
        }

        @Override
        public AbstractHolidayPackageBuilder setDurata(int durata) {
            this.durata = durata;
            return this;
        }

        @Override
        public AbstractHolidayPackageBuilder setAreExcursiiGrup(boolean areExcursiiGrup) {
            this.areExcursiiGrup = areExcursiiGrup;
            return this;
        }
    }
}
