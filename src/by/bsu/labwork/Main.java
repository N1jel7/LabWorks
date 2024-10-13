package by.bsu.labwork;

import by.bsu.labwork.Assortment.Appliance;
import by.bsu.labwork.Assortment.Appliances.*;

import static by.bsu.labwork.Assortment.Description.Material.*;

public class Main {
    public static void main(String[] args) {

        AirСonditioner airСonditioner = new AirСonditioner(1500, 2500, true, true, 3);
        Boiler boiler = new Boiler(900, 1250, true, METAL);
        CoffeMachine coffeMachine = new CoffeMachine(1750, 150, false, true, 1);
        Compressor compressor = new Compressor(520, 200, true, PLASTIC);
        Lamp lamp = new Lamp(1500, 30, true, PLASTIC);
        SolderingIron solderingIron = new SolderingIron(25, 70, false, WOOD);
        Toaster toaster = new Toaster(400, 500, true, false, 0);
        VacuumCleaner vacuumCleaner = new VacuumCleaner(350, 1000, true, true, 5);
        WashingMachine washingMachine = new WashingMachine(1299, 800, true, true, 2);
        Welding welding = new Welding(750, 5500, true, METAL);

        System.out.println(lamp.toString());

        int CPS = Appliance.getCPS();

        System.out.printf("Общая потребляемая мощность %d ватт.", CPS);
    }
}