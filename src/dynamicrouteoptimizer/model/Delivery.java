package dynamicrouteoptimizer.model;

import java.util.Optional;

public class Delivery {
    private Location origin;
    private Location destination;
    private int priority; // 1 (highest) to 5 (lowest)
    private Optional<String> notes;

    public Delivery(Location origin, Location destination, int priority, Optional<String> notes) {
        this.origin = origin;
        this.destination = destination;
        this.priority = priority;
        this.notes = notes;
    }

    public Location getOrigin() {
        return origin;
    }

    public void setOrigin(Location origin) {
        this.origin = origin;
    }

    public Location getDestination() {
        return destination;
    }

    public void setDestination(Location destination) {
        this.destination = destination;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Optional<String> getNotes() {
        return notes;
    }

    public void setNotes(Optional<String> notes) {
        this.notes = notes;
    }
}
