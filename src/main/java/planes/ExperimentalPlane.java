package planes;

import models.ClassificationLevel;

public class ExperimentalPlane extends Plane {

    private final ClassificationLevel classificationLevel;
    private final ClassificationLevel highAltitude;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ClassificationLevel highAltitude, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.classificationLevel = classificationLevel;
        this.highAltitude = highAltitude;

    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public ClassificationLevel getHighAltitude() {
        return highAltitude;
    }

    public String getModel() {
        return super.model;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + getModel() + '\'' +
                '}';
    }
}