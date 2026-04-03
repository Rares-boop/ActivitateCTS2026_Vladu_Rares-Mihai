package cts.vladu.raresmihai.g1098.singleton.model;

public class Membership implements AbstractMembership{
    private String nume;
    private double pret;
    private static final Membership membership = new Membership("Default", 20);

    private Membership() {
    }

    private Membership(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public static Membership getInstance(){
        return membership;
    }

    @Override
    public void afiseazaDetalii() {
        final StringBuilder sb = new StringBuilder("Membership{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        System.out.println(sb.toString());
    }
}
