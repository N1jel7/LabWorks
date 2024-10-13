package by.bsu.labwork.Figures;

public class Circle extends Figures {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double figPerim() {
        return (2 * Math.PI * radius);
    }
}
