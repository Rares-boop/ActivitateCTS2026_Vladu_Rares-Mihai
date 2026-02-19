package ro.ase.cts.main;

import ro.ase.cts.animals.*;
import ro.ase.cts.zoo.Zoo;
import ro.ase.cts.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args){
        System.out.println("DA");

        ZooKeeper zooKeeper = new ZooKeeper("new zookeeper");
        Zoo zoo = new Zoo("new zoo", zooKeeper);

        zoo.addAnimal(new Lion("new lion",8, FoodType.MEAT, 200));
        zoo.addAnimal(new Zebra("new zebra",7, FoodType.GRASS, 2));

        zoo.addAnimal(new Zebra("new zebra",7, FoodType.GRASS, 2));
        zoo.addAnimal(new Monkey("new monkey",7, FoodType.BANANA));

        zoo.feedAllAnimals();
    }
}
