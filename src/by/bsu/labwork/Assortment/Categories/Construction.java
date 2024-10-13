package by.bsu.labwork.Assortment.Categories;

import by.bsu.labwork.Assortment.Appliance;
import by.bsu.labwork.Assortment.Description.Material;

public class Construction extends Appliance {

    private Material material;


    public Construction(int cost, int powerConsumption, boolean enabled, Material material) {
        super(cost, powerConsumption, enabled);
        this.material = material;
    }

    @Override
    public String toString() {
        return "Цена: " + super.getCost()
                + ", материал: " + material.getDescription()
                + ", мощность потребления (Ватт): " + super.getPowerConsumption()
                + ", состояние: " + (super.isEnabled() ? "включен" : "выключен");
    }
}
