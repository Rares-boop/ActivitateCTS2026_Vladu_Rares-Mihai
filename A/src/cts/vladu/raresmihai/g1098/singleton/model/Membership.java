package cts.vladu.raresmihai.g1098.singleton.model;

public class Membership implements AbstractMembership{
    private int id;
    private String nume;
    private double pret;
    private static volatile Membership membership = null;

    private Membership() {
    }

    private Membership(int id, String nume, double pret) {
        this.id = id;
        this.nume = nume;
        this.pret = pret;
    }

    public static synchronized Membership getInstance(int id, String nume, double pret){
        if(membership == null){
            membership = new Membership(id, nume, pret);
        }
        return membership;
    }

    @Override
    public void afiseazaDetalii() {
        StringBuilder sb = new StringBuilder("Membership ");
        sb.append(this.id).append(" ");
        sb.append(this.nume);
        System.out.println(sb.toString());
    }

}
