public class Main {

    public static void main(String[] args) throws Exception {

        // Testing Dog class
        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Dog fido = new Dog("Fido");
        fido.bark();

        // Testing Cat class
        Cat cat = new Cat();
        cat.purr();
        cat.eat();

        Cat garfield = new Cat("Garfield");
        garfield.purr();

        // Testing the NoiseCapable interface
        NoiseCapable dog1 = new Dog();
        dog1.makeNoise();

        NoiseCapable cat1 = new Cat("Garfield");
        cat1.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }
}