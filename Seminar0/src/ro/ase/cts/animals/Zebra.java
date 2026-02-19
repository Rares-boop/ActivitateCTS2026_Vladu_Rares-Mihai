package ro.ase.cts.animals;

public class Zebra extends Animal{
    private int height;

    public Zebra(String name, int age, FoodType foodType, int height) {
        super(name, age, foodType);
        this.height = height;
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println(super.name + " eats "+super.foodType);
    }
}
