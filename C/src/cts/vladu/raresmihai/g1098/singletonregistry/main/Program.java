package cts.vladu.raresmihai.g1098.singletonregistry.main;

import cts.vladu.raresmihai.g1098.singletonregistry.model.Cuptor;
import cts.vladu.raresmihai.g1098.singletonregistry.model.CuptorUpdated;
import cts.vladu.raresmihai.g1098.singletonregistry.model.RegistryCuptor;


public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        Cuptor cuptor = Cuptor.getInstance(5, 200);
        Cuptor newCuptor = Cuptor.getInstance(6, 200);

        new Thread(()->{
            Cuptor cuptor1 = Cuptor.getInstance(7, 240);
            Cuptor cuptorBun = Cuptor.getInstance(8, 240);

            System.out.println(cuptor1);
            System.out.println(cuptorBun);

        }).start();

        System.out.println(cuptor);
        System.out.println(newCuptor);

        try{

            CuptorUpdated cuptorRegistry = RegistryCuptor.getCuptor(5);
            CuptorUpdated newCuptorRegistry = RegistryCuptor.getCuptor(6);

            System.out.println(cuptorRegistry);
            System.out.println(newCuptorRegistry);

        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}
