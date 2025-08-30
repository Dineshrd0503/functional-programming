package dynamicrouteoptimizer.model;

import java.util.function.Function;

public class TrafficData {
    private String routeId;
    private double delayMinutes;
    private Function<Double,Double> delayFunction;
    public TrafficData(String routeId, double delayMinutes) {
        this.routeId = routeId;
        this.delayMinutes = delayMinutes;
        this.delayFunction = (delay) -> delay * 1.5; // Example function to increase delay by 50%
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }

    public double getDelayMinutes() {
        return delayMinutes;
    }

    public void setDelayMinutes(double delayMinutes) {
        this.delayMinutes = delayMinutes;
    }

    public Function<Double, Double> getDelayFunction() {
        return delayFunction;
    }

    public void setDelayFunction(Function<Double, Double> delayFunction) {
        this.delayFunction = delayFunction;
    }
}
