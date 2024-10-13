package by.bsu.labwork.Assortment.Appliances;

import by.bsu.labwork.Assortment.Categories.Construction;
import by.bsu.labwork.Assortment.Description.Material;

public class Boiler extends Construction {
    public Boiler(int cost, int powerConsumption, boolean enabled, Material material) {
        super(cost, powerConsumption, enabled, material);
    }
}
