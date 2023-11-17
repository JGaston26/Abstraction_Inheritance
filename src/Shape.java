public abstract class Shape {
    private int sides;

    public Shape(int s) {
        sides = s;
    }

    public int getSides() {
        return sides;
    }

    public abstract double area();
}
