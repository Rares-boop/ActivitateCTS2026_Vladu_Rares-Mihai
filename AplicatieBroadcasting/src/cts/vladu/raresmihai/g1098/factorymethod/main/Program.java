package cts.vladu.raresmihai.g1098.factorymethod.main;

import cts.vladu.raresmihai.g1098.factorymethod.model.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        WebminarFactory webminarFactory = new WebminarFactory();
        IEvent webminar = webminarFactory.createEvent("Webminar", "O descriere");

        ConferintaFactory conferintaFactory = new ConferintaFactory();
        IEvent conferinta = conferintaFactory.createEvent("Conferinta", "O alta descriere");

        WorkshopFactory workshopFactory = new WorkshopFactory();
        IEvent workshop = workshopFactory.createEvent("Workshop", "Inca una");

        IEvent workshop1 = workshopFactory.createEvent("Alt workshop", "Descriere frumoasa");

        webminar.afiseaza();
        conferinta.afiseaza();

        workshop.afiseaza();
        workshop1.afiseaza();

    }
}
