package cts.vladu.raresmihai.g1098.singleton.main;

import cts.vladu.raresmihai.g1098.singleton.model.Masina;
import cts.vladu.raresmihai.g1098.singleton.model.Service;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Service service = Service.createInstance("Repara bine");
        Service newService = Service.createInstance("Service");

        new Thread(()->{
            Service threadService = Service.createInstance("Service nou");
            Service threadService1 = Service.createInstance("Alt service");

            System.out.println(threadService);
            System.out.println(threadService1);

            threadService.reparaMasina();
            threadService1.reparaMasina();

        }).start();

        Masina masina = new Masina("Ford", 4, 567);
        Masina masina1 = new Masina("Mercedes", 4 ,897);

        System.out.println(service);
        System.out.println(newService);

        service.printeazaChitanta(masina, 1000);
        newService.printeazaChitanta(masina1, 2000);
        
    }
}
