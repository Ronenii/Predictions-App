package engine2ui.simulation.genral.impl.properties;

import engine2ui.simulation.genral.impl.properties.action.api.DTOAction;

import java.util.List;

public class DTORule {
    private final String name;
    private final int ticks;
    private final double probability;
    private final List<DTOAction> actions;

    public DTORule(String name, int ticks, double probability, List<DTOAction> actions) {
        this.name = name;
        this.ticks = ticks;
        this.probability = probability;
        this.actions = actions;
    }

    public String getName() {
        return name;
    }

    public int getTicks() {
        return ticks;
    }

    public double getProbability() {
        return probability;
    }

    public List<DTOAction> getActions() {
        return actions;
    }

    @Override
    public String toString() {

        return String.format("Name: %s\n", name) +
                String.format("Invoke every: %s ticks\n", ticks) +
                String.format("Probability of successful invoke: %s\n", probability * 100.0) +
                String.format("Number of actions: %s\n", actions.size()) +
                "Actions: \n";
    }
}
