package gui.simulation.breakdown.details.rule.action.condition;

import engine2ui.simulation.genral.impl.properties.action.api.DTOAction;
import engine2ui.simulation.genral.impl.properties.action.impl.DTOMultipleCondition;
import engine2ui.simulation.genral.impl.properties.action.impl.DTOSingleCondition;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ThenElseDetailsController {

    @FXML
    private Label lblThenCount;

    @FXML
    private Label lblElseCount;

    public void updateThenAndElse(DTOAction action){
        if(action instanceof DTOSingleCondition){
            DTOSingleCondition singleCondition = (DTOSingleCondition)action;
            lblThenCount.setText(String.valueOf(singleCondition.getThenActionCount()));
            lblElseCount.setText(String.valueOf(singleCondition.getElseActionCount()));
        }
        else {
            DTOMultipleCondition multipleCondition = (DTOMultipleCondition)action;
            lblThenCount.setText(String.valueOf(multipleCondition.getThenActionCount()));
            lblElseCount.setText(String.valueOf(multipleCondition.getElseActionCount()));
        }
    }
}