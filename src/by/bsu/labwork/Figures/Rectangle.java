package by.bsu.labwork.Figures;

public class Rectangle extends Figures {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double figPerim() {
        return (length * 2) + (width * 2);
    }
}
