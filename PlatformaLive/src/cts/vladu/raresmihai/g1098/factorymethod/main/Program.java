package cts.vladu.raresmihai.g1098.factorymethod.main;

import cts.vladu.raresmihai.g1098.factorymethod.model.*;

public class Program {
    public static void main(String[] args) {
        System.out.println("DA");

        AbstractSportFactory fotbalFactory = new FotbalFactory();
        AbstractSportFactory baschetFactory = new BaschetFactory();

        AbstractSportFactory handbalFactory = new HandbalFactory();

        Sport fotbal = fotbalFactory.getSport("Fotbal", "O echipa", "Alta echipa");
        Sport baschet = baschetFactory.getSport("Baschet", "Gazda", "Oaspete");

        Sport handbal = handbalFactory.getSport("Handbal", "Alta Gazda", "Alt Oaspete");
        Sport fotbal1 = fotbalFactory.getSport("Alt fotbal", "Echipa", "Alta echipa");

        System.out.println(fotbal);
        System.out.println(baschet);

        System.out.println(handbal);
        System.out.println(fotbal1);

    }
}
