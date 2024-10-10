package by.bsu.labwork;

import by.bsu.labwork.assortment.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer("ASRock", "NVIDIA GTX 1080 TI", "AMD RYZEN 5 5600X", 32, 700, 1024, true);
        System.out.println(computer.toString());
    }
}