package by.bsu.labwork.Assortment.Categories;

import by.bsu.labwork.Assortment.Appliance;

public class Household extends Appliance {

    private boolean guarantee;
    private int guaranteePeriod;

    public Household(int cost, int powerConsumption, boolean enabled, boolean guarantee, int guaranteePeriod) {
        super(cost, powerConsumption, enabled);
        this.guaranteePeriod = guaranteePeriod;
        this.guarantee = guarantee;
    }

    public boolean isGuarantee() {
        return guarantee;
    }

    public void setGuarantee(boolean guarantee) {
        this.guarantee = guarantee;
    }

    public int getGuaranteePeriod() {
        return guaranteePeriod;
    }

    public void setGuaranteePeriod(int guaranteePeriod) {
        this.guaranteePeriod = guaranteePeriod;
    }

    @Override
    public String toString() {
        return "Цена: " + super.getCost()
                + ", гарантия: " + isGuarantee()
                + ", срок гарантии: " + getGuaranteePeriod()
                + ", мощность потребления (Ватт): " + super.getPowerConsumption()
                + ", состояние: " + (super.isEnabled() ? "включен" : "выключен");
    }
}
