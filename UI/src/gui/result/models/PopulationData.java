package gui.result.models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Used for the entity count component.
 */
public class PopulationData {
    private final String name;
    private final SimpleIntegerProperty population;

    public PopulationData(String name, int population) {
        this.name = name;
        this.population = new SimpleIntegerProperty(population);
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population.get();
    }

    public SimpleIntegerProperty populationProperty() {
        return population;
    }

    public void setPopulationValue(int value) {
        this.population.set(value);
    }
}
