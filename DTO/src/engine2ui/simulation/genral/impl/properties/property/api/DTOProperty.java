package engine2ui.simulation.genral.impl.properties.property.api;

abstract public class DTOProperty {
    private final String name;
    private final String type;
    private final boolean isRandomInit;

    public DTOProperty(String name, String type, boolean isRandomInit) {
        this.name = name;
        this.type = type;
        this.isRandomInit = isRandomInit;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public boolean isRandomInit() {
        return isRandomInit;
    }

    @Override
    public String toString() {

        return String.format("\tName: %s\n", name) +
                String.format("\tType: %s\n", type) +
                String.format("\tRandomly initialized: %s\n", isRandomInit);
    }
}