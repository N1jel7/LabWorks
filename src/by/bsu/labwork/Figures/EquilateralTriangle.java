package by.bsu.labwork.Figures;

public class EquilateralTriangle extends Figures {

    private final double length;

    public EquilateralTriangle(double length) {
        this.length = length;
    }

    @Override
    public double figPerim() {
        return length * 3;
    }
}
