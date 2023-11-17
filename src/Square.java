public class Square extends Shape {

    public Square(int sides) {
        super(sides);
    }

    @Override
    public double area() {
        return getSides() * getSides();
    }
}
