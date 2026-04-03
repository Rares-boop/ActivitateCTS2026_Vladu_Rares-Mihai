package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Autobuz;
import ro.ase.cts.prototype.clase.MijlocTransport;

public class Program {
    public static void main(String[] args){
        System.out.println("DA");

        try {
            MijlocTransport autobuz = new Autobuz(4, 30, 6, "CEG");
            MijlocTransport autobuz1 = autobuz.cloneaza();

            ((Autobuz)autobuz1).setCod("TGH");
            ((Autobuz)autobuz1).setPretCalatorie(5);

            System.out.println(autobuz);
            System.out.println(autobuz1);

        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
