package ro.ase.cts.prototype.main;

import ro.ase.cts.prototype.clase.Rezervare;
import ro.ase.cts.prototype.clase.RezervareAbstracta;

public class Program {
    public static void main(String[] args){
        System.out.println("DA");

        RezervareAbstracta rezervare = new Rezervare("Client ", 20,
                "astazi", "0753663333");
        RezervareAbstracta newRezervare = rezervare.rezerva();

        Rezervare altaRezervare = new Rezervare("Alt client ",21,
                "maine", "0746324476");
        Rezervare rezervare1 = (Rezervare) altaRezervare.rezerva();

        System.out.println(rezervare);
        System.out.println(newRezervare);

        ((Rezervare)rezervare).setOraRezervare(20);
        ((Rezervare)rezervare).setZiua("maine");

        System.out.println(rezervare);
        System.out.println(newRezervare);

        System.out.println(altaRezervare);
        System.out.println(rezervare1);
    }
}
