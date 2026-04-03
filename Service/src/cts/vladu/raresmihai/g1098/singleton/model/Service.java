package cts.vladu.raresmihai.g1098.singleton.model;

public class Service implements IService{
    private String nume;
    private static volatile Service service = null;

    private Service() {
    }

    private Service(String nume) {
        this.nume = nume;
    }

    public static synchronized Service createInstance(String nume){
        if(service == null){
            service = new Service(nume);
        }
        return service;
    }

    @Override
    public void reparaMasina() {
        System.out.println("Service ul " + this.nume + " repara masina ");
    }

    @Override
    public void printeazaChitanta(AMasina masina, double pret) {
        StringBuilder sb = new StringBuilder("Service ul ");
        sb.append(service.nume).append(" a reparat masina ");
        sb.append(masina.model).append(" cu pret reparatie ");
        sb.append(pret);

        System.out.println(sb.toString());
    }
}
