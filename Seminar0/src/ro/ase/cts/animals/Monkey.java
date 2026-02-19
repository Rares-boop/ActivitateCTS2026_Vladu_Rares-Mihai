package ro.ase.cts.animals;

public class Monkey extends Animal{

    public Monkey(String name, int age, FoodType foodType) {
        super(name, age, foodType);
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println(super.name + " eats "+super.foodType);
    }
}
