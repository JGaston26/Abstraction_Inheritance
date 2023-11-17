public class Cat extends Animal {

    private String breed;

    public Cat(String n, String b) {
        super(n);
        breed = b;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("i am a " + breed);
    }

    public void sleep() {
        System.out.println("i am sleeping");
    }

}
