package ro.ase.cts.simplefactory.transport;

public class Troleibuz extends MijlocTransport{
    private String program;

    public Troleibuz(int nrRoti, int nrLocuri, String program) {
        super(nrRoti, nrLocuri);
        this.program = program;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Troleibuz{");
        sb.append("program='").append(program).append('\'');
        sb.append(super.toString());
        return sb.toString();
    }
}
