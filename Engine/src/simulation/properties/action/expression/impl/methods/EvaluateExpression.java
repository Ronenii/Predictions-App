package simulation.properties.action.expression.impl.methods;

import simulation.properties.action.expression.api.AbstractExpression;
import simulation.properties.action.expression.api.Expression;
import simulation.properties.property.api.Property;
import simulation.properties.property.api.PropertyType;

public class EvaluateExpression extends AbstractExpression {
    private Property property;
    private final String entityName;

    public EvaluateExpression(PropertyType returnValueType, Property property, String entityName) {
        super(returnValueType);
        this.property = property;
        this.entityName = entityName;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public String getEntityName() {
        return entityName;
    }
    @Override
    public String getPropertyName(){return property.getName();}

    @Override
    public String toString() {
        return String.format("Evaluate(%s.%s)",entityName, property.getName());
    }

    @Override
    public PropertyType getType() {
        return property.getType();
    }

    @Override
    public Object evaluate() {
        return property.getValue();
    }

    @Override
    public Expression dupExpression() {
        return new EvaluateExpression(getReturnValueType(), property.dupProperty(), entityName);
    }
}
