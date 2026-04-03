package cts.vladu.raresmihai.g1098.singleton.model;

public class Membership extends AbstractMembership{
    private static volatile Membership membership = null;

    private Membership() {
    }

    private Membership(String numeAbonament, double pret) {
        super(numeAbonament, pret);
    }

    public static synchronized Membership getInstance(String numeAbonament, double pret){
        if(membership == null){
            membership = new Membership(numeAbonament, pret);
        }
        return membership;
    }

    public void afiseazaDetalii(){
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());

        System.out.println(sb.toString());
    }
}
