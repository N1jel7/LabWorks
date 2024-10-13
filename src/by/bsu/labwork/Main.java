package by.bsu.labwork;

import by.bsu.labwork.Figures.Circle;
import by.bsu.labwork.Figures.EquilateralTriangle;
import by.bsu.labwork.Figures.Rectangle;
import by.bsu.labwork.Figures.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(20.99);
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(12.124);
        Rectangle rectangle = new Rectangle(11.5, 15.414);
        Square square = new Square(4.3838);

        System.out.printf("Периметр круга: %f \n", circle.figPerim());
        System.out.printf("Периметр равностороннего треугольника: %f \n", equilateralTriangle.figPerim());
        System.out.printf("Периметр прямоугольника: %f \n", rectangle.figPerim());
        System.out.printf("Периметр квадрата: %f \n", square.figPerim());
    }

}