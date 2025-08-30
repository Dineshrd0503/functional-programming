package dynamicrouteoptimizer.model;

public abstract class Route {
    protected double estimatedTime;
    public double getEstimatedTime(){
        return estimatedTime;
    }
    public void setEstimatedTime(double estimatedTime){
        this.estimatedTime = estimatedTime;
    }
    public abstract double calculateEstimatedTime();

}
