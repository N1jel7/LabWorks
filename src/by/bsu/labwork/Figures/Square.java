package by.bsu.labwork.Figures;

public class Square extends Figures {
    private final double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double figPerim() {
        return length * 4;
    }
}
