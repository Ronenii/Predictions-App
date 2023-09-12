package engine2ui.simulation.execution;

import engine2ui.simulation.runtime.SimulationRunData;

public class StartResponse {
    private final boolean success;

    private final String message;

    private final SimulationRunData simulationRunData;

    public StartResponse(boolean success, String message, SimulationRunData simRunData){
        this.message = message;
        this.success = success;
        this.simulationRunData = simRunData;
    }

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }

    public SimulationRunData getSimulationRunData() {
        return simulationRunData;
    }
}
