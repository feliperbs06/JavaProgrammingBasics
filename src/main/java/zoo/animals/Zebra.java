package zoo.animals;

public class Zebra implements Animal {
    @Override
    public void feed() {
        System.out.println("Zebra eats grass, looking around anxiously...");
    }

    @Override
    public void pet() {
        System.out.println("Zebra looks at you strangely and runs away...");
    }
}
