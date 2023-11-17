public class Main {
    public static void main(String[] args) {
        Animal a = new Animal("jumpy");
        a.speak();

        Cat c = new Cat("fluffly", "shorthair");
        c.speak();
        c.sleep();
    }
}
