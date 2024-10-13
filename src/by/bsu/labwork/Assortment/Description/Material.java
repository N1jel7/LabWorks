package by.bsu.labwork.Assortment.Description;

public enum Material {

    METAL("Металл"),
    PLASTIC("Пластик"),
    WOOD("Дерево");

    private final String description;

    private Material(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
