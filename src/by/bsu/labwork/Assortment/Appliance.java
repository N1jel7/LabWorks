package by.bsu.labwork.Assortment;

public class Appliance {
    private int cost;
    private int powerConsumption;
    private static int CPS; // common power consumption
    private boolean enabled;

    public Appliance(int cost, int powerConsumption, boolean enabled) {
        this.enabled = enabled;
        this.cost = cost;
        this.powerConsumption = powerConsumption;
        if(enabled) {
            CPS += powerConsumption;
        }
    }

    public static int getCPS() {
        return CPS;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
