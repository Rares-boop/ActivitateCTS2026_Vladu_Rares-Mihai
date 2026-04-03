package ro.ase.cts.builder.clase;

public class AutobuzLinie {
    private String model;
    private String numeSofer;
    private boolean opresteCapat;
    private boolean deschideUsiNesolicitat;
    private String textAfisat;

    private AutobuzLinie(String model, String numeSofer, boolean opresteCapat,
                         boolean deschideUsiNesolicitat, String textAfisat) {
        this.model = model;
        this.numeSofer = numeSofer;
        this.opresteCapat = opresteCapat;
        this.deschideUsiNesolicitat = deschideUsiNesolicitat;
        this.textAfisat = textAfisat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", numeSofer='").append(numeSofer).append('\'');
        sb.append(", opresteCapat=").append(opresteCapat);
        sb.append(", deschideUsiNesolicitat=").append(deschideUsiNesolicitat);
        sb.append(", textAfisat='").append(textAfisat).append('\'');
        sb.append('}');
        return sb.toString();
    }

     public static class AutobuzBuilder implements AbstractAutobuzLinieBuilder{
        private final AutobuzLinie autobuzLinie;

        public AutobuzBuilder(String model, String numeSofer) {
            this.autobuzLinie = new AutobuzLinie(model, numeSofer, false, false,
                    "default");
        }

        @Override
        public AutobuzLinie build() {
            return this.autobuzLinie;
        }

        @Override
        public AbstractAutobuzLinieBuilder setOpresteCapat(boolean opresteCapat) {
            this.autobuzLinie.opresteCapat = opresteCapat;
            return this;
        }

        @Override
        public AbstractAutobuzLinieBuilder setDeschideUsiNesolicitat(boolean deschideUsiNesolicitat) {
            this.autobuzLinie.deschideUsiNesolicitat = deschideUsiNesolicitat;
            return this;
        }

        @Override
        public AbstractAutobuzLinieBuilder setTextAfisat(String textAfisat) {
            this.autobuzLinie.textAfisat = textAfisat;
            return this;
        }
    }
}

